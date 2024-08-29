package com.netsnickers.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @GetMapping("/health-test")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Healthy!");
    }
}
