package com.ityouzi.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2020-05-19 15:27
 * @Description:
 * @Version 1.0
 */
@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "管理员权限页面";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "普通用户权限页面";
    }
}
