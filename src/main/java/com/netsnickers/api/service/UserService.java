package com.netsnickers.api.service;

import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.mapper.GenericMapper;
import com.netsnickers.api.mapper.GenericMapperImpl;
import com.netsnickers.api.model.User;
import com.netsnickers.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GenericMapperImpl genericMapper;

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        return genericMapper.toDTOList(users, UserDTO.class);
    }

}
