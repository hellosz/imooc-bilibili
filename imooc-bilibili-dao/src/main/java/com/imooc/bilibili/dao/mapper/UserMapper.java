package com.imooc.bilibili.dao.mapper;

import com.imooc.bilibili.dao.domain.UserDao;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {

    /**
     * 根据 user_id 查询
     *
     * @param id
     * @return
     */
    UserDao queryById(Integer id);
}
