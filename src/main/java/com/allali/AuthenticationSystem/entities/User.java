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
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String email ;
    private String password ;
    private String firstName ;
    private String lastName ;
    @CreationTimestamp
    private LocalDateTime createdAt ;
    @UpdateTimestamp
    private LocalDateTime modifiedAt ;
}
