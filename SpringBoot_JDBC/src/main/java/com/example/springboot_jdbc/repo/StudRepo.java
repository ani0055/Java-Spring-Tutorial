package com.example.springboot_jdbc.repo;

import com.example.springboot_jdbc.module.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Responsible for connecting the webapp with the Database
@Repository
public class StudRepo {

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private JdbcTemplate template;

    public void save(Student stud){

        String query = "insert into student (id, name, tech) values (?,?,?)";
        template.update(query, stud.getId(), stud.getName(), stud.getTech());
    }

    public List<Student> findAll(){
        return new ArrayList<Student>();
    }

}
