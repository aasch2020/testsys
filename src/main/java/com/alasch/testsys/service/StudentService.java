package com.alasch.testsys.service;

import com.alasch.testsys.model.student;

import java.util.List;

public interface StudentService {
    public student saveStudent(student s);
    public List<student> getAll();
}
