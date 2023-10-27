package com.springboot.springdatajpa.service;

import com.springboot.springdatajpa.entity.Student;
import com.springboot.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {
        Student student = null;
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            student = optional.get();
        }
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllByFirstName(String name) {
        List<Student> students = studentRepository.findAllByFirstName(name);
        return students;
    }
}
