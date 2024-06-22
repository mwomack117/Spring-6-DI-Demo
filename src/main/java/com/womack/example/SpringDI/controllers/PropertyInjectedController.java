package com.womack.example.SpringDI.controllers;

import com.womack.example.SpringDI.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
