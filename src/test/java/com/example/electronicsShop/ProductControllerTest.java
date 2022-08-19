package com.example.electronicsShop;

import com.example.electronicsShop.controller.ProductController;
import com.example.electronicsShop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @MockBean
    ProductService productService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void it_should_get_all_products() throws Exception {
        mockMvc.perform(get("/product")).andExpect(status().isOk());
    }
}
