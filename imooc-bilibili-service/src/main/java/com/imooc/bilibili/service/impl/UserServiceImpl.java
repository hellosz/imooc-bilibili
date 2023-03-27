package com.imooc.bilibili.service.impl;

import com.imooc.bilibili.dao.domain.UserDao;
import com.imooc.bilibili.dao.mapper.UserMapper;
import com.imooc.bilibili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @description:
 * @author: Neng.Tian
 * @create: 2023-03-27 15:56
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 根据 id 查询
     *
     * @param id
     * @return
     */
    @Override
    public UserDao queryById(Integer id) {
        return userMapper.queryById(id);
    }
}
