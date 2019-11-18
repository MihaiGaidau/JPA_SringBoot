package com.learning.database.service;

import com.learning.database.bean.User;
import com.learning.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Collection<User> findAll(){
        log.info("Request to get user.");
        return userRepository.findAll();
    }

}
