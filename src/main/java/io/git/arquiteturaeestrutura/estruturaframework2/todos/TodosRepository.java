package io.git.arquiteturaeestrutura.estruturaframework2.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<TodosEntity, Integer> {
    boolean existsBydescricao(String descricao);
}
