package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 1;

    static {
        todos.add(new Todo(todosCount++, "in28Minutes", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "in28Minutes", "Learn Struts", LocalDate.now().plusYears(6), false));
        todos.add(new Todo(todosCount++, "in28Minutes", "Learn Hibernate", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(
                todosCount++,
                username,
                description,
                targetDate,
                done
        );
        todos.add(todo);
    }

    public void deleteById(int id) {
        // todo.getId() == id
        // todo -> todo.getId() == id // for each element in todo check if its id matches
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
