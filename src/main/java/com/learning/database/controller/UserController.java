package com.learning.database.controller;


import com.learning.database.bean.User;
import com.learning.database.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @GetMapping("/list")
    public ResponseEntity<Collection<User>> test(){
        return ResponseEntity.ok(userService.findAll());
    }

}
