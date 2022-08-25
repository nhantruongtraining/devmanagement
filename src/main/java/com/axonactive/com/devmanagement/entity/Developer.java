package com.axonactive.com.devmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 100)
    private String lastName;

    @Column (length = 100)
    private String middleName;

    @Column (length = 100)
    private String firstName;

    @Column (length = 6)
    private String gender;

    @Email
    @Column (length = 100)
    private String email;

    @Column
    @Enumerated (EnumType.STRING)
    private Title title;

    @Column
    private Float salary;

    @Column
    private LocalDate hiredDate;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "team_id")
    private Team team;
}
