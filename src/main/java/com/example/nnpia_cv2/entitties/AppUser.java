package com.example.nnpia_cv2.entitties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Boolean active;
    @Column
    private LocalDateTime creationDate;
    @Column
    private LocalDateTime updateDate;
    @OneToMany(mappedBy = "author_id")
    private List<Task> tasks = Collections.emptyList();
}
