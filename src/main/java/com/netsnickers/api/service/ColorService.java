package com.netsnickers.api.service;

import com.netsnickers.api.dto.ColorDTO;
import com.netsnickers.api.mapper.ColorMapper;
import com.netsnickers.api.model.Color;
import com.netsnickers.api.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<ColorDTO> findAll(){
        List<Color> colors = colorRepository.findAll();

        List<ColorDTO> colorDTOs = new ArrayList<ColorDTO>();
        for (Color color : colors) {
            colorDTOs.add(ColorMapper.convertToDTO(color, ColorDTO.class));
        }

        return colorDTOs;
    }
}
