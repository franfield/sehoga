package com.yoga.classservice.model;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue
    long id;
    String name;

    @ManyToOne
    Event event_;
}
