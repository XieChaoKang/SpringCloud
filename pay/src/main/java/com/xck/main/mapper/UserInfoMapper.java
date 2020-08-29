package com.xck.main.mapper;

import com.xck.main.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xck
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 查询个人信息
     * @return
     * */
    List<UserInfo> queryInfo();
}
