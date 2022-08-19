package com.example.electronicsShop.service;

import com.example.electronicsShop.model.Product;
import com.example.electronicsShop.model.ShoppingCart;
import com.example.electronicsShop.repository.ProductRepository;
import com.example.electronicsShop.repository.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductRepository productRepository;

    public void addProduct(Integer productId, Integer shoppingCartId) {
        Optional<Product> product = productRepository.findById(productId);
        Optional<ShoppingCart> shoppingCart = shoppingCartRepository.findById(shoppingCartId);
        shoppingCart.get().addProduct(product.get());
    }

    public void removeProduct(Integer productId, Integer shoppingCartId) {
        Optional<Product> product = productRepository.findById(productId);
        Optional<ShoppingCart> shoppingCart = shoppingCartRepository.findById(shoppingCartId);
        shoppingCart.get().removeProduct(product.get());
    }

    public Integer totalPrice(Integer shoppingCartId) {
        Optional<ShoppingCart> shoppingCart = shoppingCartRepository.findById(shoppingCartId);
        return shoppingCart.get().totalPrice();
    }

    public ShoppingCart createShoppingCart() {
        ShoppingCart sc = new ShoppingCart();
        return shoppingCartRepository.save(sc);
    }
}
