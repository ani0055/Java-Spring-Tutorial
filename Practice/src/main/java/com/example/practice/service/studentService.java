package com.example.practice.service;

import com.example.practice.model.student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class studentService {

    List<student> Students = new ArrayList<>(Arrays.asList(
            new student(101,"Komal Pandey",20,"Artificial Intelligence"),
            new student(102,"Rahul Subramanyam",19,"Data Analytics"),
            new student(103,"Shravan Swami",20,"Image Processing"),
            new student(104,"Radhika Tiwari",20,"Network Security"),
            new student(105,"Kartik Patil",21,"Cloud Computing")
    ));

    public List<student> getStudents(){
        return Students;
    }

    public student getStudId(int id){
        for(int i = 0; i<Students.size(); i++){
            if(Students.get(i).getStudId() == id) return Students.get(i);
        }
        return new student(100,"Not Found",0,"Null");
    }

    public student getStudCou(String Cour){
        for(student s : Students){
            if(s.getCourse().equals(Cour)) return s;
        }

        return  new student(100,"Not Found",0,"Null");
    }
}
