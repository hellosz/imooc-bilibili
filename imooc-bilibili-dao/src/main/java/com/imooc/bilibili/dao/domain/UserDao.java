package com.imooc.bilibili.dao.domain;

import java.io.Serializable;

/**
 * @ClassName: UserDao
 * @description:
 * @author: Neng.Tian
 * @create: 2023-03-27 14:56
 **/
public class UserDao implements Serializable {
    private static final long serialVersionUID = 7329323482924701938L;

    private Long id;

    private String name;

    private Integer age;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
