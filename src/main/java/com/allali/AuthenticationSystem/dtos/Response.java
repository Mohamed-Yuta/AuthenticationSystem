package com.allali.AuthenticationSystem.dtos;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private Long id ;
    private int statusCode ;
    private String responseMessage ;
    private UserInfo userInfos ;
    private OtpResponse otpResponse ;
}
