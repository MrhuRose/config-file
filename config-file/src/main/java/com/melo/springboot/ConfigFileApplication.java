package com.melo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigFileApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ConfigFileApplication.class);
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }
}
