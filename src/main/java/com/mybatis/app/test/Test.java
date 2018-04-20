package com.mybatis.app.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.app.dao.UserDao;
import com.mybatis.app.daoImpl.UserDaoImpl;
import com.mybatis.app.entity.User;
import com.mybatis.app.mapping.UserMapping;
import com.mybatis.app.methods.Commons;

public class Test {
	
//	public static void main(String[] args) throws IOException {
//		Commons commons = new Commons();
//		SqlSession session = commons.getMethods();
//        String username = "jack";
//        String pass = "123456";
//        UserMapping um = session.getMapper(UserMapping.class);
//        User u = new User();
//        u.setLoginName(username);
//        u.setPassword(pass);
//        User user = um.getUserInfo(u);
//        System.out.println(user.toString());
//        
//	}
	public static void main(String[] args) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		UserDao userDao = new UserDaoImpl();
		String username = "jack";
		String pass = "123456";
		map = userDao.getUserInfo(username, pass);
	}
}
