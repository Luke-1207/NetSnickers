package com.netsnickers.api.controller;

import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("{email}/{password}")
    public ResponseEntity<Boolean> login(@PathParam("email") String email, @PathParam("password") String password) {
        return ResponseEntity.ok(userService.login(email, password));
    }

    @PostMapping()
    public ResponseEntity<Boolean> create(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.create(user));
    }

    @GetMapping("{idUser}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long idUser){
        return ResponseEntity.ok(userService.findById(idUser));
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PutMapping()
    public ResponseEntity<Boolean> update(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("{idUser}")
    public ResponseEntity<Boolean> update(@PathVariable Long idUser){
        return ResponseEntity.ok(userService.delete(idUser));
    }
}
