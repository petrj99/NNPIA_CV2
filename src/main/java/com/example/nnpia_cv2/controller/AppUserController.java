package com.example.nnpia_cv2.controller;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.entitties.AppUserRole;
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

    @PutMapping("/{id}")
    public ResponseEntity<AppUser> updateUser(@PathVariable Long id, @RequestBody AppUser userDetails){
        return appUserRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setUsername(userDetails.getUsername());
                    existingUser.setPassword(userDetails.getPassword());
                    existingUser.setActive(userDetails.getActive());
                    existingUser.setCreationDate(userDetails.getCreationDate());
                    existingUser.setUpdateDate(userDetails.getUpdateDate());

                    AppUser updatedUser = appUserRepository.save(existingUser);
                    return ResponseEntity.ok(updatedUser);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        return appUserRepository.findById(id)
                .map(user -> {
                    appUserRepository.delete(user);
                    return ResponseEntity.ok().build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
