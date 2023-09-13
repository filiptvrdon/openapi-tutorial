package sk.filiptvrdon.todo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-13T11:40:12.191+02:00[Europe/Prague]")
public class Todo implements Serializable {

    private static final long serialVersionUID = 1L;
        @javax.persistence.Id
        @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)

            private Integer id;

            private String name;

            private String description;

            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            private Date createdAt;

            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            private Date dueAt;

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

    public Todo createdAt(Date createdAt) {
        this.createdAt = createdAt;
    return this;
    }

    /**
        * Get createdAt
    * @return createdAt
    */
        @Valid 
        @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("created_at")
    public Date getCreatedAt() {
    return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
    }

    public Todo dueAt(Date dueAt) {
        this.dueAt = dueAt;
    return this;
    }

    /**
        * Get dueAt
    * @return dueAt
    */
        @Valid 
        @Schema(name = "due_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @JsonProperty("due_at")
    public Date getDueAt() {
    return dueAt;
    }

    public void setDueAt(Date dueAt) {
    this.dueAt = dueAt;
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
    Objects.equals(this.createdAt, todo.createdAt) &&
    Objects.equals(this.dueAt, todo.dueAt) &&
    Objects.equals(this.completed, todo.completed);
}

    @Override
    public int hashCode() {
    return Objects.hash(id, name, description, createdAt, dueAt, completed);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Todo {\n");
sb.append("    id: ").append(toIndentedString(id)).append("\n");
sb.append("    name: ").append(toIndentedString(name)).append("\n");
sb.append("    description: ").append(toIndentedString(description)).append("\n");
sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
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
