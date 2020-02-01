package com.yoga.classservice.model;

import javax.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    Teacher teacher;

    ClassType
    classType;

    String name;

}
