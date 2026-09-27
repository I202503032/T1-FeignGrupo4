package org.example.t1feigngrupo4.controller;

import org.example.t1feigngrupo4.dto.UserPlaceHolder;
import org.example.t1feigngrupo4.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserPlaceHolder> getUsers() {
        return userService.getUsers();
    }
}