package com.example.electronicsShop;

import com.example.electronicsShop.model.ShoppingCart;
import com.example.electronicsShop.repository.ShoppingCartRepository;
import com.example.electronicsShop.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Test
    public void it_should_create_shopping_cart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        assertThat(shoppingCartService.createShoppingCart()).isSameAs(shoppingCart);
    }
}
