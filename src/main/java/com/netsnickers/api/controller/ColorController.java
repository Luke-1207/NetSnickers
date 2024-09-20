package com.netsnickers.api.controller;

import com.netsnickers.api.dto.ColorDTO;
import com.netsnickers.api.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cor/")
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping()
    public ResponseEntity<List<ColorDTO>> findAll(){
        return ResponseEntity.ok(colorService.findAll());
    }
}
