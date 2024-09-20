package com.netsnickers.api.service;

import com.netsnickers.api.dto.BrandDTO;
import com.netsnickers.api.mapper.BrandMapper;
import com.netsnickers.api.model.Brand;
import com.netsnickers.api.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<BrandDTO> findAll() {
        List<Brand> brands = brandRepository.findAll();

        List<BrandDTO> brandDTOs = new ArrayList<BrandDTO>();
        for(Brand brand : brands) {
            brandDTOs.add(BrandMapper.convertToDTO(brand, BrandDTO.class));
        }

        return brandDTOs;
    }
}
