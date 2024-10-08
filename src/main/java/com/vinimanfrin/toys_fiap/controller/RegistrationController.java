package com.vinimanfrin.toys_fiap.controller;

import com.vinimanfrin.toys_fiap.models.UserST;
import com.vinimanfrin.toys_fiap.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/signup")
    public String createUser(UserST user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "login";
    }
}
