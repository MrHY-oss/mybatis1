package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userdao.getUserList();

        for(User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
