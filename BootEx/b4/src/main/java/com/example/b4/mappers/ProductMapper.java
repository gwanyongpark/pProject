package com.example.b4.mappers;

import java.util.List;
import java.util.Map;

import com.example.b4.dto.PageRequestDTO;
import com.example.b4.dto.ProductListDTO;
import com.example.b4.dto.ProductRegisterDTO;

public interface ProductMapper {
  
  List<ProductListDTO> getList(PageRequestDTO pageRequestDTO);

  int insertProduct(ProductRegisterDTO registerDTO);

  int insertImages(List<Map<String,String>> imageList);

}