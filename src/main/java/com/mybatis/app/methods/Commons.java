package com.mybatis.app.methods;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

public class Commons {
	public SqlSession getMethods() throws IOException {
	        String resource = "mybatis-config.xml";
	        
	        InputStream is = Resources.getResourceAsStream(resource);
	       
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	      
	        SqlSession session = sessionFactory.openSession();
	        
	        return session;
	}
}
