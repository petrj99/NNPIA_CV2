package com.example.nnpia_cv2.repository;

import com.example.nnpia_cv2.entitties.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
