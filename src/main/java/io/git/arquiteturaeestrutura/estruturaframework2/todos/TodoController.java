package io.git.arquiteturaeestrutura.estruturaframework2.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {
    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }
    @PostMapping //para salvar
    public TodosEntity salvar(@RequestBody TodosEntity todo){
        try {
            return this.service.salvar(todo);
        }catch (IllegalArgumentException e){
            var mensagemerror = e.getMessage();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, mensagemerror);
        }

    }
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") Integer id, @RequestBody TodosEntity todoatt){
        todoatt.setId(id);
        service.atualizar(todoatt);
    }
    @GetMapping("{id}")
    public TodosEntity buscar(@PathVariable("id") Integer id){
        return service.buscarid(id);
    }

}
