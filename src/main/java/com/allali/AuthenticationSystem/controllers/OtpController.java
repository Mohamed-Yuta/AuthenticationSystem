package com.allali.AuthenticationSystem.controllers;

import com.allali.AuthenticationSystem.dtos.OtpRequest;
import com.allali.AuthenticationSystem.dtos.Response;
import com.allali.AuthenticationSystem.services.OtpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/otp")
@AllArgsConstructor
public class OtpController {
    private final OtpService otpService ;

    @PostMapping("sendOtp")
    public Response sendOtp(@RequestBody OtpRequest otpRequest){
        return otpService.sendOtp(otpRequest);
    }
}
