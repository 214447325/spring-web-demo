package com.mybatis.app.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 学生和课程表
 * @author User
 *
 */
public class UserCourses implements Serializable{
	
	private Integer id;
	
	private List<User> user;
	
	private List<Courses> courses;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return courses.toString();
	}

}
