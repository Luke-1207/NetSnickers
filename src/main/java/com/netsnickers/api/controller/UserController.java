package com.netsnickers.api.controller;

import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.model.User;
import com.netsnickers.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("health-test")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Healthy!");
    }

    @PostMapping()
    public ResponseEntity<String> create(@RequestBody UserDTO user){
        return ResponseEntity.ok("Healthy!");
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> list(){
        return ResponseEntity.ok(userService.findAll());
    }
}
