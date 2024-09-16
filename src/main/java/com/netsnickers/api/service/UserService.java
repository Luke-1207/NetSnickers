package com.netsnickers.api.service;

import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.mapper.EntityDTOMapper;
import com.netsnickers.api.mapper.UserMapper;
import com.netsnickers.api.model.Profile;
import com.netsnickers.api.model.User;
import com.netsnickers.api.repository.ProfileRepository;
import com.netsnickers.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    public Boolean login(String email, String password){
        User user = userRepository.findByEmail(email);

        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public Boolean create(UserDTO userDTO) {
        Profile profile = profileRepository.getReferenceById(userDTO.getProfile().getIdProfile());
        User user = UserMapper.convertToEntity(userDTO, User.class);
        user.setProfile(profile);

        userRepository.save(user);

        return true;
    }

    public UserDTO findById(Long idUser) {
        User user = userRepository.getReferenceById(idUser);
        return UserMapper.convertToDTO(user, UserDTO.class);
    }

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();

        List<UserDTO> userDTOs = new ArrayList<>();
        for (User user : users) {
            userDTOs.add(UserMapper.convertToDTO(user, UserDTO.class));
        }

        return userDTOs;
    }

    public Boolean update(UserDTO userDTO) {
        User existingUser = userRepository.getReferenceById(userDTO.getIdUser());

        if (existingUser != null) {
            Profile profile = profileRepository.getReferenceById(userDTO.getProfile().getIdProfile());
            User user = UserMapper.convertToEntity(userDTO, User.class);
            user.setProfile(profile);

            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    public Boolean delete(Long idUser) {
        User user = userRepository.getReferenceById(idUser);
        userRepository.delete(user);
        return true;
    }

}
