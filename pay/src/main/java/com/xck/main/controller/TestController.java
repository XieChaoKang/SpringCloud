package com.xck.main.controller;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.xck.main.service.InfoService;
import entity.UserInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author admin
 */

@Api(tags = "测试")
@RestController
@RequestMapping("/pay/")
public class TestController {

    @Autowired
    private InfoService infoService;


    @RequestMapping("test")
    public String test(){
        List<UserInfo> userInfoList = infoService.queryInfo();
        Gson gson = new Gson();
        return gson.toJson(userInfoList);
    }
}
