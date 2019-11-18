package com.learning.database;

import com.learning.database.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;



public class UserController {
    @Autowired
    private UserRepository repository ;
    private String name = "misa";

}
