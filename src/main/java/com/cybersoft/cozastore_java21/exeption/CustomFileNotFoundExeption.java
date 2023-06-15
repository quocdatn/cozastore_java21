package com.cybersoft.cozastore_java21.exeption;

public class CustomFileNotFoundExeption extends RuntimeException{

    private int status;
    private String message;

    public CustomFileNotFoundExeption(){}
    public CustomFileNotFoundExeption(int status, String massage){
        this.status = status;
        this.message = massage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
