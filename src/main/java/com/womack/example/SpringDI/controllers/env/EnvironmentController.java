package com.womack.example.SpringDI.controllers.env;

import com.womack.example.SpringDI.services.env.EnvService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvService envService;

    public EnvironmentController(EnvService envService) {
        this.envService = envService;
    }

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("javaVer = " + this.javaVer);
    }

    public String getJavaVer(){
        return "javaVer = " + this.javaVer;
    }

    public String sayEnvironment() {
        return envService.getEnv();
    }
}
