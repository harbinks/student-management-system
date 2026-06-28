package com.harbin.studentmanagementsystem.controller;

import com.harbin.studentmanagementsystem.entity.Student;
import com.harbin.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);

    }

}