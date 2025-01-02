package com.skypro.greeter030125.controller;

import com.skypro.greeter030125.service.GreeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    private final GreeterService greeterService;

    public GreeterController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", required = false) String name) {//required -(r)екуа'йреть
        return greeterService.greeter(name);
    }
    // required=false в аннотации @RequestParam означает
    // что данный параметр может принимать значение null
    // или быть пустой строкой
}
