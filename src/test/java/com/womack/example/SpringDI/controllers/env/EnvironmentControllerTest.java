package com.womack.example.SpringDI.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"UAT", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sayEnvironment() {
        System.out.println(environmentController.sayEnvironment());
        System.out.println(environmentController.getJavaVer());
    }
}