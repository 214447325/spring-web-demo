package com.mybatis.app.entity;

import java.io.Serializable;
import java.util.List;

public class Courses implements Serializable{
	private int id;
	
	private String name;
	
	private String feedback;//反馈意见
	
	private List<UserCourses> user;
	
	private Book book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserCourses> getUser() {
		return user;
	}

	public void setUser(List<UserCourses> user) {
		this.user = user;
	}

	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Courses() {
		super();
	}

	public Courses(int id, String name, List<UserCourses> user) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
	}

	public Courses(int id, String name, List<UserCourses> user, Book book, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.book = book;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		String s = "{";
		if(name != null) {
			s = s + "name:" + name;
		};
		
		if(feedback != null) {
			s = s + ",feedback:" + feedback;
		};
		
		s = s + "}";
		return s;
	}

	
}
