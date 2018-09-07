package com.dragon.demo.shardjdbc.dao.mapper;

import java.util.List;

import com.dragon.demo.shardjdbc.dao.entity.UserEntity;

/**
* @author heaven.long
* @version 创建时间：2018年9月7日 下午2:47:25
* 类说明
*/
public interface UserMapper {
    List<UserEntity> getAll();

    void update(UserEntity user);
    
    void insert(UserEntity user);
}
