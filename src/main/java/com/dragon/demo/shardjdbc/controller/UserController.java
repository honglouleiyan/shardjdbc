package com.dragon.demo.shardjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.demo.shardjdbc.dao.entity.UserEntity;
import com.dragon.demo.shardjdbc.dao.entity.UserSexEnum;
import com.dragon.demo.shardjdbc.service.UserService;

/**
* @author heaven.long
* @version 创建时间：2018年9月7日 下午2:44:08
* 类说明
*/
@Service
@RestController
public class UserController {
	@Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userService.getUsers();
        return users;
    }

    //测试
    @RequestMapping(value="update1")
    public String updateTransactional( //@RequestParam(value = "id") Long id,
                                    @RequestParam(value = "user_id") Long user_id,
                                    @RequestParam(value = "order_id") Long order_id,
                                    @RequestParam(value = "nickName") String nickName,
                                    @RequestParam(value = "passWord") String passWord,
                                    @RequestParam(value = "userName") String userName
                                    ) {
        UserEntity user2 = new UserEntity();
       // user2.setId(id);
        user2.setUser_id(user_id);
        user2.setOrder_id(order_id);
        user2.setNickName(nickName);
        user2.setPassWord(passWord);
        user2.setUserName(userName);
        user2.setUserSex(UserSexEnum.WOMAN);
        userService.updateTransactional(user2);
        return "test";
    }

}
