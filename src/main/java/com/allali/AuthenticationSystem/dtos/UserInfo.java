package com.allali.AuthenticationSystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class UserInfo {
    private String email ;
    private String firstName ;
    private String lastName ;
}
