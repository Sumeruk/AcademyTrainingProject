package org.example.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Man {

    private String name;

    private int age;
    private String profession;

    public Man(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
