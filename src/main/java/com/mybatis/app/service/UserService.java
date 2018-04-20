package com.mybatis.app.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public Map<String, Object> getUserInfo(String userName,String passWord);
}
