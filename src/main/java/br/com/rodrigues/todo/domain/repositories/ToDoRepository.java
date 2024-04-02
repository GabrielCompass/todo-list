package br.com.rodrigues.todo.domain.repositories;

import br.com.rodrigues.todo.domain.entities.ToDoList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ToDoRepository extends MongoRepository<ToDoList, String> {
}
