package com.womack.example.SpringDI.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Dev")
@Service()
public class EnvServiceDevImpl implements EnvService {

    @Override
    public String getEnv() {
        return "In Dev Environment";
    }
}
