package com.mybatis.app.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	
	private Integer id;
	
	private String loginName;
	
	private String password;
	
	private String userName;
	
	private String phone;
	
	private String address;
	
	private List<Book> book;
	
	private List<UserCourses> courses; //课程

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public List<UserCourses> getCourses() {
		return courses;
	}
	
	public void setCourses(List<UserCourses> courses) {
		this.courses = courses;
	}

	public User() {
		super();
	}

	public User(Integer id, String loginName, String userName, String phone,
			String address, List<Book> book) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.userName = userName;
		this.phone = phone;
		this.address = address;
		this.book = book;
	}
	
	public User(Integer id, String loginName, String userName, String phone,
			String address, List<Book> book, List<UserCourses> courses) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.userName = userName;
		this.phone = phone;
		this.address = address;
		this.book = book;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", loginName:" + loginName + ", userName:"
				+ userName + ", phone:" + phone + ", address:" + address
				+ ", book:" + book + ",password:" + password + ",courses:" + courses + "}";
	}
	
}
