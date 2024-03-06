package com.example.nnpia_cv2.service;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AppUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AppUser registerNewUser(String username, String rawPassword) {
        String encodedPassword = passwordEncoder.encode(rawPassword);

        AppUser newUser = new AppUser();
        newUser.setUsername(username);
        newUser.setPassword(encodedPassword);
        newUser.setActive(true);

        return userRepository.save(newUser);
    }
}
