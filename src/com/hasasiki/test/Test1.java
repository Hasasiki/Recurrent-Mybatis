package com.hasasiki.test;

import com.hasasiki.mapper.TestMapper;
import com.hasasiki.pojo.test_table;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test1 {
    @Test
    public void quickStart() throws Exception{
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = builder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<test_table> list = sqlSession.selectList("org.mybatis.example.BlogMapper.findAll");
    }
    @Test
    public void quickStart2() throws Exception{
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = builder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        List<test_table> list = mapper.queryAll();
        System.out.println("list = " + list);
    }
}
