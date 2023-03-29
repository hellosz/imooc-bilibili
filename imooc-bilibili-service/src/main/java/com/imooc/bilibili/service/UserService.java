package com.imooc.bilibili.service;

import com.imooc.bilibili.dao.domain.UserDao;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @description:
 * @author: Neng.Tian
 * @create: 2023-03-27 15:41
 **/
public interface UserService {
    UserDao queryById(Integer id);
}