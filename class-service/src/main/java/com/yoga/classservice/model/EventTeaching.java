package com.yoga.classservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EventTeaching {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    Teacher teacher;

    @OneToOne
    Event event_;
}
