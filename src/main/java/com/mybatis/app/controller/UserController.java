package com.mybatis.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.app.service.UserService;
import com.mybatis.app.serviceImpl.UserServiceImpl;

@RestController
@EnableAutoConfiguration
public class UserController {
	private HashMap<String, Object> hashMap;
	
	UserService userService = new UserServiceImpl();
	
	@RequestMapping("/getUserInfo")
	public Map<String, Object> getUserInfo(String userName, String password) {
		hashMap = new HashMap<String, Object>();
		hashMap = (HashMap<String, Object>) userService.getUserInfo(userName, password);
		return hashMap;
	}
	
	@RequestMapping("/getMapInfo")
	public Map<String, Object> getMapInfo(@RequestParam HashMap<String, Object> map) {
		System.out.println(map.get("userName"));
		hashMap = new HashMap<String, Object>();
		hashMap.put("code", 1);
		return hashMap;
	}
}
