package com.xck.main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xck.main.entity.UserInfo;
import com.xck.main.service.InfoService;
import com.xck.main.util.JsonUtil;
import io.swagger.annotations.Api;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("test")
    public JsonUtil test(){
        List<UserInfo> userInfoList = infoService.queryInfo();
        return new JsonUtil<List>(201,"成功",userInfoList);
    }
}