package com.skypro.greeter030125.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {

    public String greeter(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Anonimus";
        }
        return "Hello," + name;
    }
}
