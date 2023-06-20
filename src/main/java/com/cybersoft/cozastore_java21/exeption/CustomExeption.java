package com.cybersoft.cozastore_java21.exeption;

public class CustomExeption extends Throwable {

    private String message;
    public CustomExeption(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
