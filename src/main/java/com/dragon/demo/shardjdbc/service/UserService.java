package com.dragon.demo.shardjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragon.demo.shardjdbc.dao.entity.UserEntity;
import com.dragon.demo.shardjdbc.dao.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

/**
* @author heaven.long
* @version 创建时间：2018年9月7日 下午2:45:43
* 类说明
*/
@Slf4j
@Service
public class UserService {
	
	@Autowired
    private UserMapper userMapper;

    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

//    @Transactional(value="test1TransactionManager",rollbackFor = Exception.class,timeout=36000)  //说明针对Exception异常也进行回滚，如果不标注，则Spring 默认只有抛出 RuntimeException才会回滚事务
    public void updateTransactional(UserEntity user) {
        try{
        	userMapper.insert(user);
            log.error(String.valueOf(user));
        }catch(Exception e){
            log.error("find exception!",e);
            throw e;   // 事物方法中，如果使用trycatch捕获异常后，需要将异常抛出，否则事物不回滚。
        }

    }
}
