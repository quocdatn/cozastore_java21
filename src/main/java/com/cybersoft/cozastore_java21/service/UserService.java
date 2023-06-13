package com.cybersoft.cozastore_java21.service;

import com.cybersoft.cozastore_java21.entity.UserEntity;
import com.cybersoft.cozastore_java21.payload.request.SignUpRequest;
import com.cybersoft.cozastore_java21.repository.UserRepository;
import com.cybersoft.cozastore_java21.service.imp.UserSeviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService implements UserSeviceImp {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean addUser(SignUpRequest request) {
        boolean isSuccess = false;

        try{
            UserEntity user = new UserEntity();
            user.setUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setEmail(request.getEmail());
        }catch (Exception e){

        }

        return isSuccess;
    }
}
