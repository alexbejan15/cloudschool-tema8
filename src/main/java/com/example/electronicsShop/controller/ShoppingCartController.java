package com.example.electronicsShop.controller;

import com.example.electronicsShop.model.ShoppingCart;
import com.example.electronicsShop.service.ShoppingCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("shoppingCart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @PostMapping("add/{productId}/{shoppingCartId}")
    public void addProduct(@PathVariable Integer productId, @PathVariable Integer shoppingCartId) {
        shoppingCartService.addProduct(productId, shoppingCartId);
    }

    @DeleteMapping("remove/{productId}/{shoppingCartId}")
    public void deleteProduct(@PathVariable Integer productId, @PathVariable Integer shoppingCartId) {
        shoppingCartService.removeProduct(productId, shoppingCartId);
    }

    @GetMapping("price/{shoppingCartId}")
    public Integer totalPrice(@PathVariable Integer shoppingCartId) {
        return shoppingCartService.totalPrice(shoppingCartId);
    }

    @PostMapping
    public ShoppingCart createShoppingCart() {
        return shoppingCartService.createShoppingCart();
    }



}
