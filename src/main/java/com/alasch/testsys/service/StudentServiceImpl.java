package com.alasch.testsys.service;

import com.alasch.testsys.model.student;
import com.alasch.testsys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public student saveStudent(student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<student> getAll() {
        return studentRepository.findAll();
    }
}
