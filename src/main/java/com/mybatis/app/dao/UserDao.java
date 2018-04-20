package com.mybatis.app.dao;

import java.util.Map;

public interface UserDao {
	
	//根据用户的姓名和密码查询用户的信息
	public Map<String, Object> getUserInfo(String userName,String password) throws Exception;
}
