package com.yoga.classservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    long id;
    String name;
}
