package com.example.electronicsShop;

import com.example.electronicsShop.model.Product;
import com.example.electronicsShop.repository.ProductRepository;
import com.example.electronicsShop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @Test
    public void when_save_product_it_should_return_product() throws Exception {
        Product product = new Product();

        when(productRepository.save(any(Product.class))).thenReturn(new Product());

        Product created = productService.saveProduct(product);

        assertThat(created.getName()).isSameAs(product.getName());
    }
}
