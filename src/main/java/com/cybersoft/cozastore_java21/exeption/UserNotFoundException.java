package com.cybersoft.cozastore_java21.exeption;

public class UserNotFoundException extends RuntimeException{

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
