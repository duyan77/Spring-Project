package com.example.springcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcode.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Tu dong method crud
}
