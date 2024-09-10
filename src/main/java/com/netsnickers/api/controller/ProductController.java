package com.netsnickers.api.controller;

import com.netsnickers.api.dto.ProductDTO;
import com.netsnickers.api.dto.ProductFilterDTO;
import com.netsnickers.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping()
    public ResponseEntity<Boolean> create(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.create(productDTO));
    }

    @GetMapping("{idProduct}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long idProduct){
        return ResponseEntity.ok(productService.findById(idProduct));
    }

    @GetMapping()
    public ResponseEntity<List<ProductDTO>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("filtrar")
    public ResponseEntity<List<ProductDTO>> findAllByFilter(@RequestBody ProductFilterDTO productFilterDTO){
        return ResponseEntity.ok(productService.findAllByFilter(productFilterDTO));
    }

    @PutMapping()
    public ResponseEntity<Boolean> update(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.update(productDTO));
    }

    @DeleteMapping("{idProduct}")
    public ResponseEntity<Boolean> update(@PathVariable Long idProduct){
        return ResponseEntity.ok(productService.delete(idProduct));
    }
}
