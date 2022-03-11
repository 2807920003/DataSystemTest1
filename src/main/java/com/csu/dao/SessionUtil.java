package com.csu.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SessionUtil {
    static SqlSessionFactory sqlSessionFactory=null;
    static {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        try {
            sqlSessionFactory=builder.build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getsession(){
        return sqlSessionFactory.openSession();
    }
}
