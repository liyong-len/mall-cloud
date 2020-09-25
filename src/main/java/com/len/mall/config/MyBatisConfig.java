package com.len.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author liyong
 * @version 1.0
 * @className MyBatisConfig
 * @description MyBatisConfig
 * @date 2020/9/25 10:14
 */
@Configuration
@MapperScan({"com.len.mall.mybatis_generator.mapper","com.len.mall.dao"})//此处可以配置多个mapper的路径，不配置会报错
public class MyBatisConfig {
}
