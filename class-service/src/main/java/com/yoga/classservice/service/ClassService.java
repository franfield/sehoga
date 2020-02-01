package com.yoga.classservice.service;

import com.yoga.classservice.model.Event;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.repository.EventAttendanceRepository;
import com.yoga.classservice.repository.EventRepository;
import com.yoga.classservice.repository.EventTeachingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClassService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventAttendanceRepository eventAttendanceRepository;

    @Autowired
    EventTeachingRepository eventTeachingRepository;

    public List<Event> getAllClasses() {
        List<Event> aClasses = new ArrayList<Event>();
        eventRepository.findAll().forEach((n) -> aClasses.add(n));
        return aClasses;
    }

    public List<Student> getStudentsByClass(Event event_) {
        return eventAttendanceRepository.getStudentsByClass_(event_);
    }

    public List<Event> getClassesByTeacher(Teacher teacher_) {
        return eventTeachingRepository.getClassByTeacher(teacher_);
    }

    public void addClass(Event classToAdd) {
        eventRepository.save(classToAdd);
    }

    public void updateClass(Event classToUpdate) {
        eventRepository.save(classToUpdate);
    }

    public void deleteClass(Long id) {
        eventRepository.deleteById(id);
    }
}
