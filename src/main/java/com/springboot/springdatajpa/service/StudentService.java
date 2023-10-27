package com.springboot.springdatajpa.service;


import com.springboot.springdatajpa.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
    List<Student> findAllByFirstName(String name);
}
