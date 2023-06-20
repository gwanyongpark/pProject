package com.example.b4.mappers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.b4.dto.PageRequestDTO;
import com.example.b4.dto.ProductListDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ProductMapperTests {
    
    @Autowired(required = false)
    ProductMapper productMapper;

    @Test
    public void testGetList(){

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();

        List<ProductListDTO> result = productMapper.getList(pageRequestDTO);

        log.info("-------------");
        
        log.info(result);
    }
}