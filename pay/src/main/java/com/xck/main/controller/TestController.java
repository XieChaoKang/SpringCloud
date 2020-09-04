package com.xck.main.controller;

import com.xck.main.service.InfoService;
import entity.UserInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.JsonUtil;

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
    public JsonUtil test(){
        List<UserInfo> userInfoList = infoService.queryInfo();
        return new JsonUtil<List>(201,"成功",userInfoList);
    }
}
