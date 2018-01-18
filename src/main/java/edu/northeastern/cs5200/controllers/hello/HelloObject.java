package edu.northeastern.cs5200.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HelloObject {
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public HelloObject(String message) {
        this.message = message;
    }
    public HelloObject() {
    }
}

