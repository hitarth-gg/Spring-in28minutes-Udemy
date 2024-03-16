package org.example.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component // since we want spring to manage it therefore we annotate the class as a component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now()));
        users.add(new User(++usersCount, "Eve", LocalDate.now()));
        users.add(new User(++usersCount, "Jim", LocalDate.now()));
    }

    public List<User> findAll() {
        return users;
    }

    public User retrieveUser(int id) {

        // either use for loop to iterate through the list and find by id
        // or use functional programming :
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);

    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super  User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
