package com.womack.example.SpringDI.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service()
public class EnvServiceProdImpl implements EnvService {
    @Override
    public String getEnv() {
        return "In Prod environment";
    }
}
