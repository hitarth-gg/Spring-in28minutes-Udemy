package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // since this is a service class, we need to add the @Service annotation
//@Component
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("asd");
        boolean isValidPassword = password.equalsIgnoreCase("asdf");
        return isValidUserName && isValidPassword;
    }
}
