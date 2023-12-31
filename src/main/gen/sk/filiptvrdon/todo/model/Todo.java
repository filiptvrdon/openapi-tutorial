package sk.filiptvrdon.todo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
* Todo Item
*/

        @javax.persistence.Entity
        @Schema(name = "todo", description = "Todo Item")
            @JsonTypeName("todo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-14T13:06:43.523+02:00[Europe/Prague]")
public class Todo implements Serializable {

    private static final long serialVersionUID = 1L;
        @javax.persistence.Id
        @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)

            private Integer id;

            private String name;

            private String description;

            private Boolean completed;

    public Todo id(Integer id) {
        this.id = id;
    return this;
    }

    /**
        * Get id
    * @return id
    */
        
        @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("id")
    public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }

    public Todo name(String name) {
        this.name = name;
    return this;
    }

    /**
        * Get name
    * @return name
    */
        
        @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("name")
    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public Todo description(String description) {
        this.description = description;
    return this;
    }

    /**
        * Get description
    * @return description
    */
        
        @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("description")
    public String getDescription() {
    return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    public Todo completed(Boolean completed) {
        this.completed = completed;
    return this;
    }

    /**
        * Get completed
    * @return completed
    */
        
        @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("completed")
    public Boolean getCompleted() {
    return completed;
    }

    public void setCompleted(Boolean completed) {
    this.completed = completed;
    }

@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
    Todo todo = (Todo) o;
    return Objects.equals(this.id, todo.id) &&
    Objects.equals(this.name, todo.name) &&
    Objects.equals(this.description, todo.description) &&
    Objects.equals(this.completed, todo.completed);
}

    @Override
    public int hashCode() {
    return Objects.hash(id, name, description, completed);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Todo {\n");
sb.append("    id: ").append(toIndentedString(id)).append("\n");
sb.append("    name: ").append(toIndentedString(name)).append("\n");
sb.append("    description: ").append(toIndentedString(description)).append("\n");
sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
sb.append("}");
    return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(Object o) {
    if (o == null) {
    return "null";
    }
    return o.toString().replace("\n", "\n    ");
    }
    }
