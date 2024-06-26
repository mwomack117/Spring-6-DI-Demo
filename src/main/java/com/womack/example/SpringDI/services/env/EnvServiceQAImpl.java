package com.womack.example.SpringDI.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"QA", "default"})
@Service()
public class EnvServiceQAImpl implements EnvService {
    @Override
    public String getEnv() {
        return "In QA environment";
    }
}
