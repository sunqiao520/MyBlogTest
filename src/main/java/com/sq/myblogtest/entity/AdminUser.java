package com.sq.myblogtest.entity;

import lombok.Data;

/**
 * @author SunQiao
 * @create 2021-05-17 19:32
 */

@Data
public class AdminUser {
    private Integer adminUserId;

    private String loginUserName;

    private String loginPassword;

    private String nickName;

    private Byte locked;

}
