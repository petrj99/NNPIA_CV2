package com.example.nnpia_cv2.repository;

import com.example.nnpia_cv2.entitties.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    @Query("SELECT au FROM AppUser au JOIN au.appUserRoles r WHERE r.role.name = :roleName")
    List<AppUser> findByRole(@Param("roleName") String roleName);
}
