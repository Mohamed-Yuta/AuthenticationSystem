package com.allali.AuthenticationSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Otp {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String otp ;
    private String email ;
    @CreationTimestamp
    private LocalDateTime createdAt ;
    private LocalDateTime expiredAt;
}
