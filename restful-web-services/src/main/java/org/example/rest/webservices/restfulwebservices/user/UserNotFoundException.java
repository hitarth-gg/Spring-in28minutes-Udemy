package org.example.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND) // to return a status of 404 not found, by default it returns 500 internal server error
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
            super(message); // pass the message to the superclass, which is the RuntimeException
    }
}
