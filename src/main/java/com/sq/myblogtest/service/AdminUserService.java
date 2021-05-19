package com.sq.myblogtest.service;

import com.sq.myblogtest.entity.AdminUser;

/**
 * @author SunQiao
 * @create 2021-05-18 14:33
 */
public interface AdminUserService {
    AdminUser login(String userName,String password);

    AdminUser getUserDetailById(Integer loginUserId);

    Boolean updatePassword(Integer loginUserId,String originalPassword,String newPassword);

    Boolean updateName(Integer loginUserId,String loginUserName,String nickName);
}
