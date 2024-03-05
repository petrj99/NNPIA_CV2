package com.example.nnpia_cv2.controller;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/app-user")
public class AppUserController {

    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping("/{id}")
    public ResponseEntity<AppUser> getUserById(@PathVariable Long id){
        Optional<AppUser> userOptional = appUserRepository.findById(id);

        if (!userOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(userOptional.get());
    }

    @PostMapping
    public ResponseEntity<AppUser> createUser(@RequestBody AppUser newUser){
        AppUser savedUser = appUserRepository.save(newUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
