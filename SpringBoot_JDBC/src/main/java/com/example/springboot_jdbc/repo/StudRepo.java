// Class name is repo because we are configuring it with the repository layer of our server to connect to DB
package com.example.springboot_jdbc.repo;

import com.example.springboot_jdbc.module.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Responsible for connecting the webapp with the Database
@Repository
public class StudRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Student stud){
        String query = "insert into student (id, name, tech) values (?,?,?)";
        template.update(query, stud.getId(), stud.getName(), stud.getTech());
    }

    public List<Student> findAll(){
        // we have to map the data with the rowmapper then store it in a list
        String query = "SELECT * FROM student";


        RowMapper<Student> mapper = new RowMapper<Student>() {
            // A functional interface so can use lambda functions
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setTech(rs.getString(3));
                return s;
            }
        };

        List<Student> list = template.query(query,mapper);
        return list;
    }

}
