package io.git.arquiteturaeestrutura.estruturaframework2.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {
    private TodosRepository repository;

    public TodoValidator(TodosRepository repository) {
        this.repository = repository;
    }

    public void validar(TodosEntity todo){
        if(existeTodoDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe essa descrição");
        }

    }
    public boolean existeTodoDescricao(String descricao){
        return repository.existsBydescricao(descricao);
    }
}
