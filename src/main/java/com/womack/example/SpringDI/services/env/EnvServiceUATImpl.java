package com.womack.example.SpringDI.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service()
public class EnvServiceUATImpl implements EnvService {
    @Override
    public String getEnv() {
        return "In UAT environment";
    }
}
