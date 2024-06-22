package com.womack.example.SpringDI.controllers;

import com.womack.example.SpringDI.services.GreetingService;
import com.womack.example.SpringDI.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the MyController");

        return greetingService.sayGreeting();
    }
}
