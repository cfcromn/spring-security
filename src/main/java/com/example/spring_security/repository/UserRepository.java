package com.example.spring_security.repository;

import com.example.spring_security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    boolean existsByUsername(String username);


    UserEntity findByUsername(String username);
}
