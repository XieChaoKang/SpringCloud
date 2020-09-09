package com.xck.main.service.impl;


import com.xck.main.service.InfoService;
import entity.UserInfo;
import com.xck.main.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 */
@Service("infoService")
public class InfoServiceImpl implements InfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> queryInfo() {
        return userInfoMapper.queryInfo();
    }
}
