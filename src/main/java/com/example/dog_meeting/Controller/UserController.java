package com.example.dog_meeting.Controller;

import com.example.dog_meeting.dto.LoginRequest;
import com.example.dog_meeting.dto.LoginResponse;
import com.example.dog_meeting.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return userService.login(request.getId(), request.getPassword());
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String loginInfo() {
        return "로그인 페이지에 오신 걸 환영합니다!";
    }
}
