package com.example.c868Backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Type {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String type;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
}
