package com.animesh.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
// lombok handles all the stuff with the getters and setters
@Data
@AllArgsConstructor
public class product {

    private int proId;
    private String proName;
    private int price;

}
