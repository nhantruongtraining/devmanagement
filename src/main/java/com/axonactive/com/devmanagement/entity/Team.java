package com.axonactive.com.devmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 100)
    private String name;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "team")
    private List<Developer> developers;
}
