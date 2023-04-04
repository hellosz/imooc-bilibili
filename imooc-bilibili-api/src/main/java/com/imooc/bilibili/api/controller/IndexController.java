package com.imooc.bilibili.api.controller;

import com.imooc.bilibili.dao.domain.UserDao;
import com.imooc.bilibili.dao.exception.BusinessException;
import com.imooc.bilibili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: IndexController
 * @description:
 * @author: Neng.Tian
 * @create: 2023-03-27 13:53
 **/
@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public String index() throws Exception {

        if (true) {
            throw new Exception("this is exception class");
        }

        return "hello world";
    }

    @GetMapping("/user")
    public UserDao user(@RequestParam(name="id") Integer id) {
        // 数据查询
        UserDao userDao = userService.queryById(id);
        return userDao;
    }
}
