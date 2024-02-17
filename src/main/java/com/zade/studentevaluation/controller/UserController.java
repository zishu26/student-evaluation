package com.zade.studentevaluation.controller;

import com.zade.studentevaluation.entity.User;
import com.zade.studentevaluation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evaluation/user")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User registerUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }
}
