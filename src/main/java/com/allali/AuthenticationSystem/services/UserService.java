package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.LoginRequest;
import com.allali.AuthenticationSystem.dtos.Request;
import com.allali.AuthenticationSystem.dtos.Response;

public interface UserService {
    Response signup(Request request);
    Response login(LoginRequest loginRequest);
    Response sendOtp();
    Response validateOtp();
    Response resetPassword();
    Response changePassword();
}
