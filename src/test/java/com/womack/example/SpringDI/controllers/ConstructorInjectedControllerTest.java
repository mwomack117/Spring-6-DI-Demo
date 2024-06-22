package com.womack.example.SpringDI.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorController;

    @Test
    void sayHello() {
        System.out.println(constructorController.sayHello());
    }
}