package com.example.dog_meeting.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "sys_user")
public class User {

    @Id
    @Column(name = "UserID", nullable = false, length = 40)
    private String id;

    @Column(name = "UserPW",nullable = false, length = 40)
    private String password;

    @Column(name = "UserNAME", nullable = false, length = 40)
    private String UserNAME;

    @Column(name = "UserDogNAME", nullable = false, length = 40)
    private String UserDogNAME;

    @Column(name = "createdt", nullable = false, updatable = false)
    private LocalDateTime createdt;

    @PrePersist  // 저장 직전에 실행
    public void prePersist() {
        this.createdt = LocalDateTime.now();
    }
}
