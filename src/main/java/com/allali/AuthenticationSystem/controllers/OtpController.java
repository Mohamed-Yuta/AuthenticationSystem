package com.allali.AuthenticationSystem.controllers;

import com.allali.AuthenticationSystem.services.OtpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/otp")
@AllArgsConstructor
public class OtpController {
    private final OtpService otpService ;

}
