package com.xck.main.service;

import com.xck.main.entity.UserInfo;

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
