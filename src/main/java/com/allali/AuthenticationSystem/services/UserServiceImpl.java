package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.LoginRequest;
import com.allali.AuthenticationSystem.dtos.Request;
import com.allali.AuthenticationSystem.dtos.Response;
import com.allali.AuthenticationSystem.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository ;
    @Override
    public Response signup(Request request) {
        // if the user exist return error;
        if (userRepository.findByEmail(request.getEmail()).isPresent()){

        }
        return null;
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response sendOtp() {
        return null;
    }

    @Override
    public Response validateOtp() {
        return null;
    }

    @Override
    public Response resetPassword() {
        return null;
    }

    @Override
    public Response changePassword() {
        return null;
    }
}
