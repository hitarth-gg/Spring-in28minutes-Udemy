package org.example.rest.webservices.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User retrievedUser = service.retrieveUser(id);
        if (retrievedUser == null) {
            throw new UserNotFoundException("id: " + id);
        }
        else {
            return retrievedUser;
        }
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
         User savedUser = service.save(user);

        // /users/4 => /users  /{id} => user.getId()
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}") // to append the id to the current request
                .buildAndExpand(savedUser.getId()) // to replace the {id} with the actual id
                .toUri(); // to convert it to a proper URI
        return ResponseEntity.created(location).build(); // returns a status of 201 created, .build() builds the response entity object
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User retrievedUser = service.retrieveUser(id);
        if (retrievedUser == null) {
            throw new UserNotFoundException("id: " + id);
        }
        else {
            service.deleteById(id);
        }
    }

}
