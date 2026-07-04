package com.example.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class student {

    private int studId;
    private String studentName;
    private int age;
    private String course;
}
