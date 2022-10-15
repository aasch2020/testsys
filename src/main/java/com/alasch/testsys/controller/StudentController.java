package com.alasch.testsys.controller;

import com.alasch.testsys.service.StudentService;
import com.alasch.testsys.service.StudentServiceImpl;
import com.alasch.testsys.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService sService;
    @PostMapping("/add")
    public String add(@RequestBody student student){
        sService.saveStudent(student);
        return "new student added";
    }

    @GetMapping("/getAll")
    public List<student> getAllStudents(){
        return sService.getAll();
    }

}
