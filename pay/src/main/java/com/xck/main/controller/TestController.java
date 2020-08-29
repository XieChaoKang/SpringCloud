package com.xck.main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xck.main.entity.UserInfo;
import com.xck.main.service.InfoService;
import io.swagger.annotations.Api;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author admin
 */

@Api(tags = "测试")
@RestController
public class TestController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/test")
    public JSON test(){
        List<UserInfo> userInfoList = infoService.queryInfo();
        return (JSON) JSONObject.toJSON(userInfoList);
    }
}
