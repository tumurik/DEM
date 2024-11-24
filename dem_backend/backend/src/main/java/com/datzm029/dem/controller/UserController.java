package com.datzm029.dem.controller;

import com.datzm029.dem.Services.UserService;
import com.datzm029.dem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;
import java.util.UUID;

public class UserController {

    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/add/user")
    public void createUser(@RequestParam("username") String  username,
                           @RequestParam("name") String name,
                           @RequestParam("region") String  region,
                           @RequestParam("address") String  address,
                           @RequestParam("email") String  email,
                           @RequestParam("password") String  password){
        userService.addUser(new User(UUID.randomUUID(),
                username,
                name,
                region,
                address,
                email,
                BigInteger.ZERO,
                BigInteger.ZERO,
                password)
        );
    }
}
