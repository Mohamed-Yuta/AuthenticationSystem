package com.allali.AuthenticationSystem.controllers;

import com.allali.AuthenticationSystem.dtos.Request;
import com.allali.AuthenticationSystem.dtos.Response;
import com.allali.AuthenticationSystem.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService ;


    public ResponseEntity<Response> signup(@RequestBody Request request){
        return userService.signup(request);

    }
}
