package com.destin.naavi.controller;

import com.destin.naavi.documents.User;
import com.destin.naavi.service.user.UserService;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public Mono<User> add(@RequestBody User user) {
        System.out.println("User: " + user);
        return userService.createUser(user);
    }
}
