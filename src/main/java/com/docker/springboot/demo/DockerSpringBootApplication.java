package com.docker.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootApplication.class, args);
    }

    @GetMapping("/hello")
    public String Hello() {
        return "Hello Mounir! I'm a Spring Boot Application Running from Docker";
    }
}
