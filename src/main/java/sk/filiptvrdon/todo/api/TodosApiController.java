package sk.filiptvrdon.todo.api;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.web.server.ResponseStatusException;
import sk.filiptvrdon.todo.model.Todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;
import sk.filiptvrdon.todo.repository.TodoRepository;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-12T13:55:16.857931200+02:00[Europe/Bratislava]")
@Controller
@RequestMapping("${openapi.todo.base-path:/v1}")
public class TodosApiController implements TodosApi {

    private final NativeWebRequest request;

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    public TodosApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Todo> getTodo(@Parameter(name = "todoId", description = "A unique identifier for a `todo`.", required = true, in = ParameterIn.PATH) @PathVariable("todoId") String todoId) {
       return ResponseEntity.ok(todoRepository.findById(Integer.valueOf(todoId)).orElseThrow(() -> new ResponseStatusException((HttpStatus.NOT_FOUND))));
    }

    @Override
    public ResponseEntity<Void> deleteTodo(@Parameter(name = "todoId", description = "A unique identifier for a `todo`.", required = true, in = ParameterIn.PATH) @PathVariable("todoId") String todoId) {
        todoRepository.deleteById(Integer.valueOf(todoId));
        return new ResponseEntity<>(HttpStatus.valueOf(204));
    }

    @Override
    public ResponseEntity<Void> updateTodo(String todoId, Todo todo) {
        if (!(getTodo(todoId).getStatusCode().equals(HttpStatus.valueOf(200)))){
            return new ResponseEntity<>(HttpStatus.valueOf(404));
        }

        todoRepository.save(todo);
        return new ResponseEntity<>(HttpStatus.valueOf(202));
    }

    @Override
    public ResponseEntity<Void> createTodo(Todo todo, Boolean completed) {
        todoRepository.save(todo);
        return new ResponseEntity<>(HttpStatus.valueOf(201));
    }

    @Override
    public ResponseEntity<List<Todo>> getTodos(Boolean completed) {
        return ResponseEntity.ok(todoRepository.getByCompleted(completed));
    }
}
