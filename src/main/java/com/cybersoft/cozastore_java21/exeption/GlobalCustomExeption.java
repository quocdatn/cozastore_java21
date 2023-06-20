package com.cybersoft.cozastore_java21.exeption;

import com.cybersoft.cozastore_java21.payload.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalCustomExeption {

    // Nơi đăng ký các exeption sẽ đc kích hoạt bên trong hàm
    @ExceptionHandler(CustomFileNotFoundExeption.class)
    public ResponseEntity<?> handleUserNotFound(Exception e){
        BaseResponse response = new BaseResponse();
        response.setStatusCode(500);
        response.setData(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ExceptionHandler(CustomFileNotFoundExeption.class)
    public ResponseEntity<?> handleCustomExeption(Exception e){
        BaseResponse response = new BaseResponse();
        response.setStatusCode(500);
        response.setData(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
