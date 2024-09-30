package com.mains.Repository;

import java.util.Optional;

import com.mains.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    // Find user by username (case-insensitive)
    Optional<Users> findByUserNameIgnoreCase(String userName);

    // Find user by email (email must be unique)
    Optional<Users> findByEmail(String email);
}

