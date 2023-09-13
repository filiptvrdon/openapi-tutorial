package sk.filiptvrdon.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.filiptvrdon.todo.model.Todo;

import java.util.List;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> getByCompleted(Boolean completed);

}
