package com.netsnickers.api.service;

import com.netsnickers.api.dto.UserDTO;
import com.netsnickers.api.model.Profile;
import com.netsnickers.api.model.User;
import com.netsnickers.api.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }
}
