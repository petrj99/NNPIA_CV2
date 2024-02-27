package com.example.nnpia_cv2.entitties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

//ddl-auto může nabývat direktiv:
//none - žádná změna schématu
//validate - oveří, že schéma databáze odpovídá mapování entit
//update - aktualizuje schéma databáze podle mapování entit
//create - vytvoří nové schéma databáze
//create-drop - vytvoří nové schéma a odstraní schéma, když je SessionFactory uzavřena

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
    @OneToMany(mappedBy = "appUserRole")
    private Set<AppUserRole> appUserRoles;
}
