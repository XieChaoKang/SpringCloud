package com.xck.main.service;

import entity.UserInfo;

import java.util.List;

/**
 * @author admin
 */
public interface InfoService {

    /**
     * 查询个人信息
     * @return
     * */
    List<UserInfo> queryInfo();
}
