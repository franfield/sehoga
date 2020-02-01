package com.yoga.classservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    long id;
    String name;
}
