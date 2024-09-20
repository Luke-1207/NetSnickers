package com.netsnickers.api.controller;

import com.netsnickers.api.dto.BrandDTO;
import com.netsnickers.api.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marca/")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping()
    public ResponseEntity<List<BrandDTO>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }

}
