package com.zxt.model;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {

    @Test
    public void TestSelectAll() throws IOException {
        //
        String resource = "D:/www/webapp11/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {

            List<User> userlist = session
                    .selectList("com.zxt.model.user.mapper.getAllUser");

            System.out.print(userlist);

        }catch(Exception e){
            System.out.print(e);
        }
        finally {
            session.close();
        }

    }

    @Test
    public void TestSelect() throws IOException {
        //
        String resource = "/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = (User) session.selectOne(
                    "com.zxt.model.user.mapper.getUserById", "1");

            System.out.print(user);

        } finally {
            session.close();
        }

    }

    @Test
    public void TestInsert() throws IOException {

        String resource = "/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = new User();
            user.setUserName("abc");
            user.setUserEmail("aaaaa");

            session.update("com.zxt.model.user.mapper", user);

            session.commit();

        } finally {
            session.close();
        }

    }

    @Test
    public void TestUpdate() throws IOException {

        String resource = "/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = new User();
            user.setUserId(7);
            user.setUserName("aaaaa");
            user.setUserEmail("aaaaa");

            session.update("com.zxt.model.user.mapper", user);

            session.commit();

        } finally {
            session.close();
        }

    }

}
