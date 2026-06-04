package com.app.ecom.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecom.dto.CartItemRequest;
import com.app.ecom.service.CartService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;
    
    @PostMapping
    public ResponseEntity<String> addToCart(
        @RequestHeader("X-User-ID") String userId,
        @RequestBody CartItemRequest request) 
        {
            if(cartService.addToCart(userId, request)){
                return ResponseEntity.status(201).body("Item added to cart successfully");
            }
            return ResponseEntity.status(400).body("Failed to add item to cart");
        }

}
