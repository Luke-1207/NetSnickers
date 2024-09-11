package com.netsnickers.api.controller;

import com.netsnickers.api.dto.OrderDTO;
import com.netsnickers.api.dto.PlaceOrderDTO;
import com.netsnickers.api.service.OrderService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity<OrderDTO> placeOrder(@RequestBody PlaceOrderDTO placeOrderDTO){
        return ResponseEntity.ok(orderService.placeOrder(placeOrderDTO));
    }

    @GetMapping("{idOrder}")
    public ResponseEntity<OrderDTO> findById(@PathVariable Long idOrder){
        return ResponseEntity.ok(orderService.findById(idOrder));
    }
}
