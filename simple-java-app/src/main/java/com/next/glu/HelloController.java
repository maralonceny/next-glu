package com.next.glu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final String ID = "HelloController_" + UUID.randomUUID();
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World from " + ID;
    }
}