package com.example.c868Backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String role;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getRole() {return role;}
    public void getRole(String role) {this.role = role;}
}
