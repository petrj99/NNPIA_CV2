package com.example.nnpia_cv2.repository;

import com.example.nnpia_cv2.entitties.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
