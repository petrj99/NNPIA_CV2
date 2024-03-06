package com.example.nnpia_cv2.runners;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.repository.AppUserRepository;
import com.example.nnpia_cv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseRunner implements CommandLineRunner {

    private final AppUserRepository appUserRepository;

    private final UserService userService;

    public DatabaseRunner(AppUserRepository appUserRepository, UserService userService) {
        this.appUserRepository = appUserRepository;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        //AppUser newUser = userService.registerNewUser("Ferko", "zelezo123");

        List<AppUser> users = appUserRepository.findAll();

        System.out.println("ID všech uživatelů:");
        for (AppUser user : users) {
            System.out.println(user.getId() + ", jméno: " + user.getUsername());
        }
    }
}
