package com.example.nnpia_cv2.runners;

import com.example.nnpia_cv2.entitties.AppUser;
import com.example.nnpia_cv2.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseRunner implements CommandLineRunner {

    private final AppUserRepository appUserRepository;

    public DatabaseRunner(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser user1 = new AppUser();
        user1.setUsername("user01");
        user1.setPassword("heslo01");
        user1.setActive(true);

        appUserRepository.save(user1);
    }
}
