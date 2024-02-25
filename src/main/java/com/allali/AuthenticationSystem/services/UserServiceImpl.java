package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.LoginRequest;
import com.allali.AuthenticationSystem.dtos.Request;
import com.allali.AuthenticationSystem.dtos.Response;
import com.allali.AuthenticationSystem.entities.User;
import com.allali.AuthenticationSystem.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository ;
    private ModelMapper modelMapper ;
    @Override
    public ResponseEntity<Response> signup(Request request) {
        // if the user exist return error;
        if (userRepository.findByEmail(request.getEmail()).isPresent()){
            return ResponseEntity.badRequest().body(Response.builder()
                            .statusCode(400)
                            .responseMessage("email already exist")
                    .build());
        }
        User user = User.builder()
                .email(request.getEmail())
                .password((request.getPassword()))
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();
        User savedUser = userRepository.save(user);

        return ResponseEntity.ok(Response.builder()
                        .statusCode(200)
                        .responseMessage("SUCCES")
                        .userInfos(modelMapper.map(savedUser,Request.class))
                .build());
    }

    @Override
    public ResponseEntity<Response> login(LoginRequest loginRequest) {
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
