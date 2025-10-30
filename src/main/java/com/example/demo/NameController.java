package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    private Name name;

    public NameController(Name name) {
        this.name = name;
    }

    @RequestMapping("/name")
    public String getName() {
        return name.name();
    }
}
