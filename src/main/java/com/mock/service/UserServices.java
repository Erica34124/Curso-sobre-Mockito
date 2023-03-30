package com.mock.service;

import com.mock.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserServices {
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        return ResponseEntity.ok().body(new User("1", "erica", "erica@gmail.com", "1234"));
    }
}
