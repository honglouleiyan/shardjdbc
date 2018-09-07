package com.dragon.demo.shardjdbc.dao.entity;

import java.io.Serializable;

/**
* @author heaven.long
* @version 创建时间：2018年9月7日 上午11:44:31
* 类说明
*/
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long id;
    private Long order_id;
    private Long user_id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
