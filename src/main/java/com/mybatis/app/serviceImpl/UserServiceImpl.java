package com.mybatis.app.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.mybatis.app.dao.UserDao;
import com.mybatis.app.daoImpl.UserDaoImpl;
import com.mybatis.app.service.UserService;

public class UserServiceImpl implements UserService{
	
	HashMap<String, Object> hashMap;
	
	UserDao userDao = new UserDaoImpl();
	
	public Map<String, Object> getUserInfo(String userName, String passWord) {
		hashMap = new HashMap<String, Object>();
		if(userName == null || passWord == null) {
			hashMap.put("code", "-1");
			hashMap.put("message", "请输入用户名和密码！");
		} else {
			try {
				hashMap = (HashMap<String, Object>) userDao.getUserInfo(userName, passWord);
			} catch (Exception e) {
				hashMap.put("code", "-2");
				hashMap.put("message", "信息异常");
				e.printStackTrace();
			}
		}
		return hashMap;
	}

}
