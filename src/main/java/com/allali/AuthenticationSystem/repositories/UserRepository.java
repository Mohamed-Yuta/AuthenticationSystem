package com.allali.AuthenticationSystem.repositories;

import com.allali.AuthenticationSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
