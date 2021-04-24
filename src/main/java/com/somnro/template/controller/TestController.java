package com.somnro.template.controller;

import cn.hutool.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2021-04-24 11:23
 **/
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/1")
    public JSONObject test001(){
        return new JSONObject().putOpt("key","好的123ok..");
    }
}
