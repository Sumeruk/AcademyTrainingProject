package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class Man {

    @Id
    private String name;

    private int age;
    private String profession;

    public Man(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
