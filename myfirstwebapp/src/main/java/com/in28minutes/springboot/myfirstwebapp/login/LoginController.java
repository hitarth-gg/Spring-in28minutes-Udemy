package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "login", method = RequestMethod.GET)
    // since we want to show the login page when the user goes to /login, we need to add a GET request handler for /login
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {


            model.put("name", name);
            model.put("password", password);

            // Authentication : name: asd, password: asdf

            return "welcome";
        } else {
            model.put("errorMessage", "Wrong Credentials ! Try Again");
            return "login";

        }
    }
}
