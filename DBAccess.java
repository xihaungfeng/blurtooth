package com.cwj.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	
	public SqlSession getSqlSession() throws IOException{
		
		//ͨ�������ļ���ȡ���ݿ�����
		Reader reader = Resources.getResourceAsReader("com/cwj/config/config.xml");
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		//ͨ��sqlSessionFactory ��session
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
