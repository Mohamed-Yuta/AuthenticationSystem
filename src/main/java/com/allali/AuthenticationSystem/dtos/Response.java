package com.allali.AuthenticationSystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Response {
    private Long id ;
    private int statusCode ;
    private String responseMessage ;
    private Request userInfos ;
}
