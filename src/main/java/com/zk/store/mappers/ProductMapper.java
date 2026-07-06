package com.zk.store.mappers;

import com.zk.store.dtos.ProductDto;
import com.zk.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper
{
    @Mapping(source = "category.id", target = "categoryId")
    ProductDto toDto(Product product);
}
