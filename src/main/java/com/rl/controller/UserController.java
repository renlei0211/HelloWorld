package com.rl.controller;

import com.rl.entity.UserInfo;
import com.rl.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "6666";
    }

    @PostMapping("/add") //post请求
    public UserInfo save(UserInfo userInfo) {
        return userInfoService.save(userInfo);
    }

    @GetMapping("/query")//get请求
    public Page<UserInfo> findByPage(Integer page, HttpServletResponse response) {

        //response.setHeader("Access-Control-Allow-Origin","*");//解决跨域请求

        if (page == null || page <= 0) {
            page = 0;
        } else {
            page -= 1;
        }
        return userInfoService.findAll(page, 5);
    }

    @GetMapping("findByName/{name}")
    public List<UserInfo> findByName(@PathVariable String name) {
        return userInfoService.findUserByName(name);
    }



}
