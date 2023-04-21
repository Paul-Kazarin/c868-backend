package com.example.c868Backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String customer;
    private String item;
    private Date startDate;
    private Date endDate;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getCustomer() {return customer;}
    public void getCustomer(String customer) {this.customer = customer;}

    public String getItem() {return item;}
    public void getItem(String item) {this.item = item;}

    public Date getStartDate() {return startDate;}
    public void getStartDate(Date startDate) {this.startDate = startDate;}

    public Date getEndDate() {return endDate;}
    public void getEndDate(Date endDate) {this.endDate = endDate;}
}
