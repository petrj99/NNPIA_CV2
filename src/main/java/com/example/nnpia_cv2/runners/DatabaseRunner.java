package com.example.nnpia_cv2.runners;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseRunner implements CommandLineRunner {

    private final AppUserRepository appUserRepository;

    public DatabaseRunner(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        AppUser user1 = new AppUser();
//        user1.setUsername("user01");
//        user1.setPassword("heslo01");
//        user1.setActive(true);
//
//        appUserRepository.save(user1);
//
//        AppUser user2 = new AppUser();
//        user2.setUsername("user02");
//        user2.setPassword("heslo02");
//        user2.setActive(false);
//
//        appUserRepository.save(user2);

        List<AppUser> users = appUserRepository.findAll();

        System.out.println("ID všech uživatelů:");
        for (AppUser user : users) {
            System.out.println(user.getId() + ", jméno: " + user.getUsername());
        }
    }
}
