package com.mz.mybatis;

import com.mz.mybatis.mapper.RoleMapper;
import com.mz.mybatis.po.Role;
import com.mz.mybatis.util.SqlSessionFactoryUtil;
import java.io.IOException;
import org.apache.ibatis.session.SqlSession;

public class Main {

  public static void main(String[] args) throws IOException{
    SqlSession sqlSession = null;
    try {
      sqlSession = SqlSessionFactoryUtil.openSqlSession();
      RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
      Role role = new Role();
      role.setRoleName("testName");
      role.setNote("testNote");
      roleMapper.insertRole(role);
      roleMapper.deleteRole(1L);
      sqlSession.commit();
    }catch (Exception e){
      System.err.println(e.getMessage());
      sqlSession.rollback();
    }finally {
      if(sqlSession!=null){
        sqlSession.close();
      }
    }


  }

}
