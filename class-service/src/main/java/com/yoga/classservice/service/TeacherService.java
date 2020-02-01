package com.yoga.classservice.service;

import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepository.findAll().forEach((n)->teachers.add(n));
        return teachers;
    }

    public void addTeacher(Teacher teacherToAdd) {
        teacherRepository.save(teacherToAdd);
    }

    public void updateTeacher(Teacher teacherToUpdate) {
        teacherRepository.save(teacherToUpdate);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
