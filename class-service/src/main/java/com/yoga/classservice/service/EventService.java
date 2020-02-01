package com.yoga.classservice.service;

import com.yoga.classservice.model.Event;
import com.yoga.classservice.model.EventAttendance;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.repository.EventAttendanceRepository;
import com.yoga.classservice.repository.EventRepository;
import com.yoga.classservice.repository.EventTeachingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EventService {

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
        List<EventAttendance> eventAttendances = eventAttendanceRepository.getAllByEventEquals(event_);
        List<Student> students = new ArrayList<>();
        eventAttendances.forEach((n)->students.add(n.getStudent()));
        return students;
    }

    public List<Event> getClassesByTeacher(Teacher teacher_) {
        return eventTeachingRepository.getClassByTeacher(teacher_);
    }

    public Event getEventById(Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        return eventOptional.get();
    }

    public void addEvent(Event classToAdd) {
        eventRepository.save(classToAdd);
    }

    public void updateClass(Event classToUpdate) {
        eventRepository.save(classToUpdate);
    }

    public void deleteClass(Long id) {
        eventRepository.deleteById(id);
    }
}
