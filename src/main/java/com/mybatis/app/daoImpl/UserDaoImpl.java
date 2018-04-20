package com.mybatis.app.daoImpl;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

import com.mybatis.app.dao.UserDao;
import com.mybatis.app.entity.User;
import com.mybatis.app.mapping.UserMapping;
import com.mybatis.app.methods.Commons;

public class UserDaoImpl implements UserDao{
	
	SqlSession sqlSession;
	
	UserMapping userMapping;
	
	Commons commons = new Commons();
	
	Map<String, Object> map;

	public Map<String, Object> getUserInfo(String userName, String password) {
		try {
			map = new HashMap<String, Object>();
			sqlSession = commons.getMethods();
			userMapping = sqlSession.getMapper(UserMapping.class);
			User user = new User();
			user.setLoginName(userName);
			user.setPassword(password);
			user = userMapping.getUserInfo(user);
			String data = "暂无该用户的信息";
			if(user != null) {
				data = user.toString();
			}
			
			System.out.println(data);
			if(data != null) {
				map.put("code", 1);
				map.put("data", data);
			} else {
				map.put("code", "-1");
				map.put("message", data);
			}
			
		} catch (Exception e) {
			map.put("code", "-1");
			map.put("message", "暂无该用户的信息");
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		return map;
	}

}
