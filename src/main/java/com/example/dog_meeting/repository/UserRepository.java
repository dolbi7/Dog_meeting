package com.example.dog_meeting.repository;

import com.example.dog_meeting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    // 기본적으로 findById(id)는 JpaRepository가 제공
    Optional<User> findByIdAndPassword(String id, String password);
}