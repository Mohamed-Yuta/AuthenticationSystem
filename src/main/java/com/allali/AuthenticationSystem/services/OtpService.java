package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.OtpRequest;
import com.allali.AuthenticationSystem.dtos.OtpResponse;
import com.allali.AuthenticationSystem.dtos.Response;
import com.allali.AuthenticationSystem.repositories.OtpRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OtpService {
    private final OtpRepository otpRepository ;
    private final EmailService emailService;

    private Response sendOtp(OtpRequest otpRequest){
        
    }
}
