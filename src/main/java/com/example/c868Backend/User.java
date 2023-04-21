package com.example.c868Backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String role;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getFirstName() {return firstName;}
    public void getFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void getLastName(String lastName) {this.lastName = lastName;}

    public String getPhone() {return phone;}
    public void getPhone(String phone) {this.role = phone;}

    public String getEmail() {return email;}
    public void getEmail(String email) {this.role = email;}

    public String getAddress() {return address;}
    public void getAddress(String address) {this.role = address;}

    public String getRole() {return role;}
    public void getRole(String role) {this.role = role;}
}
