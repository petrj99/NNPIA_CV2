package com.example.nnpia_cv2.repository;

import com.example.nnpia_cv2.entitties.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
