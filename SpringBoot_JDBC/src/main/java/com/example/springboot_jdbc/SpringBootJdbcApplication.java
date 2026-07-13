package com.example.springboot_jdbc;

import com.example.springboot_jdbc.module.Student;
import com.example.springboot_jdbc.repo.StudRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);

//        Student s1 = context.getBean(Student.class);
//        s1.setId(111);
//        s1.setName("Kunal Kamra");
//        s1.setTech("BlockChain");

        StudRepo repo = context.getBean(StudRepo.class);

//        repo.save(s1);

        System.out.println(repo.findAll());

    }

}
