package com.javaweb.dao;

import com.javaweb.pojo.User;

import java.util.List;

/**
 * @author javaok
 * 2022/11/28 23:44
 */
public interface UserDAO {
    /**
     * 登录获取账号
     *
     * @param account 账号
     * @return user
     */
    User getUserByAccount(String account);

    /**
     * 返回所有用户
     *
     * @return users list
     */
    List<User> getUsers();

    /**
     * add user into db
     *
     * @param user user
     */
    void addUser(User user);

}
