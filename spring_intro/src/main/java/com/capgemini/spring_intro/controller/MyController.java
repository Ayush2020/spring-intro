package com.capgemini.spring_intro.controller;

import com.capgemini.spring_intro.dto.DtoMapper;
import com.capgemini.spring_intro.dto.User;
import com.capgemini.spring_intro.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello from bridgelabz", HttpStatus.OK);
    }
    
}
