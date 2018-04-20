package com.mybatis.app.mapping;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.junit.runners.Parameterized.Parameters;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybatis.app.entity.Book;
import com.mybatis.app.entity.Courses;
import com.mybatis.app.entity.User;
import com.mybatis.app.entity.UserCourses;

public interface UserMapping {

	/**
	 * 根据用户名和密码查询用户的信息
	 * @param user
	 * @return
	 */
	@Select("select * from tb_user where loginname =#{loginName} and password = #{password}")
	@Results({
			@Result(id=true, column="id", property="id"),
			@Result(column="loginname", property="loginName"),
			@Result(column="username", property="userName"),
			@Result(column="phone", property="phone"),
			@Result(column="address", property="address"),
			@Result(column="password", property="password"),
			@Result(column="book_id", property="book", javaType=List.class,
					many=@Many(select="com.mybatis.app.mapping.UserMapping.getBookInfo")
			),
			@Result(column="courses_id", property="courses",javaType=List.class,
					many=@Many(select="com.mybatis.app.mapping.UserMapping.getCousesById")
			)
	})
	public User getUserInfo(User user);
	
	/**
	 * 根据用户的所有的图书的信息表示一个用户对应着多个图书的ID
	 * @param id 图书的ID
	 * @return
	 */
	@Select("select * from tb_book where id = #{id}")
	@Results({
		@Result(id=true, column="id", property="id"),
		@Result(column="courses",property="courses",javaType=Courses.class,
		one=@One(select="com.mybatis.app.mapping.UserMapping.getCoursesByBook")
		)
	})
	public List<Book> getBookInfo(Integer id);
	
	/**
	 * 根据图书的ID编号查询对应的课程
	 * @param id
	 * @return
	 */
	@Select("select * from tb_courses where book_id = #{id}")
	public Courses getCoursesByBook(Integer id);
	
	/**
	 * 根据学生的ID获取所有对应的课程
	 * @param id 学生的ID
	 * @return
	 */
	
	@Select("select * from tb_user_courses where tb_user_id = #{id}")
	@Results({
		@Result(id=true, column="id", property="id"),
		@Result(column="tb_courses_id",property="courses",javaType=List.class,
			many=@Many(select="com.mybatis.app.mapping.UserMapping.getCousesByAll")
		)
	})
	public List<UserCourses> getCousesById(Integer id);
	
	/**
	 * 获取该学生课程的所有的信息
	 * @param id 课程的Id
	 * @return
	 */
	@Select("select * from tb_courses where id = #{id}")
	public List<Courses> getCousesByAll(Integer id);
}
