package com.allali.AuthenticationSystem.repositories;

import com.allali.AuthenticationSystem.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository<Otp,Long> {
    Otp findByEmail(String email);
}
