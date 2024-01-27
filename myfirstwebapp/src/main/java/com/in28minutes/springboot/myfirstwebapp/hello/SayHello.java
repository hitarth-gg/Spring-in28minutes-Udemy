package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHello {

    @RequestMapping("hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}

