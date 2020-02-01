package com.yoga.classservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EventAttendance {

    @GeneratedValue
    @Id
    Long id;

    @OneToOne
    Student student;

    @OneToOne
    Event event;

    public Student getStudent() {
        return this.student;
    }

    public Event getEvent() {
        return this.event;
    }
}
