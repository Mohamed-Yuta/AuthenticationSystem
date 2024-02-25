package com.allali.AuthenticationSystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Request {
    private String email ;
    @JsonIgnore
    private String password ;
    private String firstName ;
    private String lastName ;

}
