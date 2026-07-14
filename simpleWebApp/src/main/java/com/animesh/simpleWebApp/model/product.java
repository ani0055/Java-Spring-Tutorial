package com.animesh.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

// lombok handles all the stuff with the getters and setters
@Data
//@AllArgsConstructor
@Component
@Entity
public class product {

    @Id
    private int proId;
    private String proName;
    private int price;

}
