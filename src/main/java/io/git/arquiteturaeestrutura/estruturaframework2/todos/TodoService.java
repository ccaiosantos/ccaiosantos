package io.git.arquiteturaeestrutura.estruturaframework2.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodosRepository todosRepository;
    private TodoValidator validator;
    private MailSender email;

    public TodoService(TodosRepository todosRepository, TodoValidator validator, MailSender email) {
        this.todosRepository = todosRepository;
        this.validator = validator;
        this.email = email;
    }

    public TodosEntity salvar(TodosEntity novotodo){
        validator.validar(novotodo);
        return todosRepository.save(novotodo);
    }
    public void atualizar(TodosEntity todo){
        todosRepository.save(todo);
        String concluido = todo.getConcluido() == Boolean.TRUE ? "concluido" : "não concluido";
        email.enviarmensagem("todo "+ todo.getDescricao()+ " foi "+ concluido);
    }
    public TodosEntity buscarid(Integer id){
        return todosRepository.findById(id).orElse(null);
    }
}
