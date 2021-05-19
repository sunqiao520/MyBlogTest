package com.sq.myblogtest.dao;

import com.sq.myblogtest.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-17 19:39
 */
public interface AdminUserMapper {

    int insert(AdminUser record);
    int insertSelective(AdminUser record);
    AdminUser login(@Param("userName") String userName,@Param("password") String password);
    AdminUser selectByPrimaryKey(Integer adminUserId);
    int updateByPrimaryKeySelective(AdminUser record);
    int updateByPrimaryKey(AdminUser record);
}
