package com.dec.students;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    String id;

    String name;
    String surname;
    int age;
}
