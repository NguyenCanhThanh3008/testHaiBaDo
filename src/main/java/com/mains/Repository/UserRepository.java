package com.mains.Repository;

import java.util.Optional;

import com.mains.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    // Tìm người dùng theo tên người dùng (case-insensitive)
    Optional<Users> findByUserNameIgnoreCase(String userName);

    // Tìm người dùng theo email (email phải duy nhất)
    Optional<Users> findByEmail(String email);
}

