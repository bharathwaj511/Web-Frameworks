package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.BharathwajStudent;
import com.example.relation.service.BharathwajStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class BharathwajStudentController {
    public BharathwajStudentService studentService;
    public BharathwajStudentController(BharathwajStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public BharathwajStudent postMethodName(@RequestBody BharathwajStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<BharathwajStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
