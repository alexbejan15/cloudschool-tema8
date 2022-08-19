package com.example.electronicsShop.dto;

import com.example.electronicsShop.model.ProductType;
import lombok.Data;

@Data
public class ProductDTO {

    ProductType type;
    String name;
    String identificationCode;
    Integer stock;
    Boolean deleted;

}
