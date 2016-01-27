package com.cwj.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	
	public SqlSession getSqlSession() throws IOException{
		
		//通过配置文件获取数据库连接
		Reader reader = Resources.getResourceAsReader("com/cwj/config/config.xml");
		//构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		//通过sqlSessionFactory 打开session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
