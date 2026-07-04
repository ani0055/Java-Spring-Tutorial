package com.example.practice.controller;

import com.example.practice.model.student;
import com.example.practice.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService service;

    @GetMapping("/students")
    public List<student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/students/id/{studId}")
    public student getStudId(@PathVariable int studId){ return service.getStudId(studId);}

    @GetMapping("/students/course/{course}")
    public student getStudCou(@PathVariable String course){return service.getStudCou(course);}

}
