package com.example.springGreeting.model;
public class Greeting{
    String message;
    public Greeting(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}