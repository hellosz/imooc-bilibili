package com.imooc.bilibili.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: ImoocBilibiliApp
 * @description:
 * @author: Neng.Tian
 * @create: 2023-03-27 11:33
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.imooc.bilibili"})
@MapperScan(basePackages = {"com.imooc.bilibili.dao.mapper"})
public class ImoocBilibiliApp {

    public static void main(String[] args) {
        // 项目启动入口
        ConfigurableApplicationContext run = SpringApplication.run(ImoocBilibiliApp.class, args);
    }
}
