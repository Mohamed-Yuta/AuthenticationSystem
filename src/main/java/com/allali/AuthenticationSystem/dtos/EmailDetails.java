package com.allali.AuthenticationSystem.dtos;

import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class EmailDetails {
    private String destinatiare ;
    private String messageBody ;
    private String subject ;
}
