package com.example.b4.mappers;

import java.util.List;

import com.example.b4.dto.PageRequestDTO;
import com.example.b4.dto.ProductListDTO;

public interface ProductMapper {
    
    List<ProductListDTO> getList(PageRequestDTO pageRequestDTO);

}
