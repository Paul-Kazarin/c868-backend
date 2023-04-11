package com.example.c868Backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // This tells Hibernate to make a table out of this class
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String type;
	private String subType;
	private String brand;
	private String model;
	private Integer year;
	private Integer length;
	private Integer weight;
	private Integer pricePerHour;
	private Integer pricePerDay;
	private Integer peopleCapacity;
	private String image;
	private Boolean active;
	private String comment;
	@Column(name = "dateCreated")
	@CreationTimestamp
	private Timestamp dateCreated;
	@Column(name = "dateUpdated")
	@UpdateTimestamp
	private Timestamp dateUpdated;

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}

	public String getType() {return type;}
	public void setType(String type) {this.type = type;}

	public String getSubType() {return subType;}
	public void setSubType(String subType) {this.subType = subType;}

	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public Integer getYear() {return year;}
	public void setYear(Integer year) {this.year = year;}

	public Integer getLength() {return length;}
	public void setLength(Integer length) {this.length = length;}

	public Integer getWeight() {return weight;}
	public void setWeight(Integer weight) {this.weight = weight;}

	public Integer getPricePerHour() {return pricePerHour;}
	public void setPricePerHour(Integer pricePerHour) {this.pricePerHour = pricePerHour;}

	public Integer getPricePerDay() {return pricePerDay;}
	public void setPricePerDay(Integer pricePerDay) {this.pricePerDay = pricePerDay;}

	public Integer getPeopleCapacity() {return peopleCapacity;}
	public void setPeopleCapacity(Integer peopleCapacity) {this.peopleCapacity = peopleCapacity;}

	public String getImage() {return image;}
	public void setImage(String image) {this.image = image;}

	public Boolean getActive() {return active;}
	public void setActive(Boolean active) {this.active = active;}

	public String getComment() {return comment;}
	public void setComment(String comment) {this.comment = comment;}

	public Timestamp getDateCreated() {return dateCreated;}
	public void setDateCreated(Timestamp dateCreated) {this.dateCreated = dateCreated;}

	public Timestamp getDateUpdated() {return dateUpdated;}
	public void setDateUpdated(Timestamp dateUpdated) {this.dateUpdated = dateUpdated;}

}
