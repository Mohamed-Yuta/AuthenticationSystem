package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.LoginRequest;
import com.allali.AuthenticationSystem.dtos.Request;
import com.allali.AuthenticationSystem.dtos.Response;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<Response> signup(Request request);
    ResponseEntity<Response> login(LoginRequest loginRequest);
    Response sendOtp();
    Response validateOtp();
    Response resetPassword();
    Response changePassword();
}
