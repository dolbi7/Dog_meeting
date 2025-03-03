package com.example.dog_meeting.service;

import com.example.dog_meeting.dto.LoginResponse;
import com.example.dog_meeting.entity.User;
import com.example.dog_meeting.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public LoginResponse login(String id, String password) {
        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return new LoginResponse(false, "존재하지 않는 아이디입니다.");
        }

        if (!user.getPassword().equals(password)) {
            return new LoginResponse(false, "비밀번호가 일치하지 않습니다.");
        }

        return new LoginResponse(true, "로그인 성공");
    }
}
