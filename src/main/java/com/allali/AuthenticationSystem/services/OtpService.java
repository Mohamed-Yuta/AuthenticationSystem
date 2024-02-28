package com.allali.AuthenticationSystem.services;

import com.allali.AuthenticationSystem.dtos.*;
import com.allali.AuthenticationSystem.entities.Otp;
import com.allali.AuthenticationSystem.repositories.OtpRepository;
import com.allali.AuthenticationSystem.utils.AppUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class OtpService {
    private final OtpRepository otpRepository ;
    private final EmailService emailService;

    public Response sendOtp(OtpRequest otpRequest){
        String otp = AppUtils.generateOtp();
        otpRepository.save(Otp.builder()
                        .otp(otp)
                        .email(otpRequest.getEmail())
                        .expiredAt(LocalDateTime.now().plusMinutes(2))
                .build());
        emailService.sendEmail(EmailDetails.builder()
                        .subject("Do Not Desclose !!")
                        .destinatiare(otpRequest.getEmail())
                        .messageBody("This organization has sent you an Otp expires in 2 min")
                .build());

        return Response.builder()
                .statusCode(200)
                .responseMessage("OK")
                .build();
    }
    public Response validateOtp(OtpValidationRequest otpValidationRequest){
        Otp otp = otpRepository.findByEmail(otpValidationRequest.getEmail());
        log.info("Email : {}",otpValidationRequest.getEmail());
        if(otp == null){
            return Response.builder()
                    .statusCode(400)
                    .responseMessage("You Have not sent an Otp").build();
        }
        if(otp.getExpiredAt().isBefore(LocalDateTime.now())){
            return Response.builder()
                    .statusCode(400)
                    .responseMessage("Expired Otp").build();
        }
        if (!otp.getOtp().equals(otpValidationRequest.getOtp())){
            return Response.builder()
                    .statusCode(400)
                    .responseMessage("Otp incorrect").build();
        }
        return Response.builder()
                .statusCode(200)
                .responseMessage("SUCCES")
                .otpResponse(OtpResponse.builder()
                        .isOtpValid(true)
                        .build())
                .build();
    }

}
