package com.example.electronicsShop.repository;

import com.example.electronicsShop.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

    Integer totalPrice();
}
