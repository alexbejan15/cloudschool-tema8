package com.example.electronicsShop.mapper;

import com.example.electronicsShop.dto.ProductDTO;
import com.example.electronicsShop.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);

}
