package com.womack.example.SpringDI.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Inside GreetingServiceSetterInjected";
    }
}
