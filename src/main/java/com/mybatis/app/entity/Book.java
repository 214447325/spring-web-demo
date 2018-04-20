package com.mybatis.app.entity;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable{

	private Integer id;
	
	private String name;
	
	private String author;
	
	private Date publicationdate;
	
	private String publication;
	
	private Double price;
	
	private String image;
	
	private String remark;
	
	private Courses courses;//课程
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Date getPublicationdate() {
		return publicationdate;
	}
	
	public void setPublicationdate(Date publicationdate) {
		this.publicationdate = publicationdate;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setimage(String image) {
		this.image = image;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Courses getCourses (Courses courses) {
		return courses;
	}
	
	public void setCourses (Courses courses) {
		this.courses = courses;
	}

	public Book() {
		super();
	}

	public Book(Integer id, String name, String author, Date publicationdate,
			String publication, Double price, String image, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publicationdate = publicationdate;
		this.publication = publication;
		this.price = price;
		this.image = image;
		this.remark = remark;
	}

	public Book(Integer id, String name, String author, Date publicationdate,
			String publication, Double price, String image, String remark,Courses courses) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publicationdate = publicationdate;
		this.publication = publication;
		this.price = price;
		this.image = image;
		this.remark = remark;
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "{name:" + name + ", author:" + author
				+ ", publicationdate:" + publicationdate + ", publication:"
				+ publication + ", price:" + price + ", image:" + image
				+ ", remark:" + remark + ",courses:" + courses + "}";
	}
	
	
}
