package com.vinimanfrin.toys_fiap.controller.errors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CustomErrorController {

    @RequestMapping("/error-404")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound() {
        return "error-404";
    }
}
