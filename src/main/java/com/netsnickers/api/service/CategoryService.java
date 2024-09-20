package com.netsnickers.api.service;

import com.netsnickers.api.dto.CategoryDTO;
import com.netsnickers.api.mapper.CategoryMapper;
import com.netsnickers.api.model.Category;
import com.netsnickers.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepository.findAll();

        List<CategoryDTO> categoryDTOs = new ArrayList<>();
        for (Category category : categories) {
            categoryDTOs.add(CategoryMapper.convertToDTO(category, CategoryDTO.class));
        }

        return categoryDTOs;
    }
}
