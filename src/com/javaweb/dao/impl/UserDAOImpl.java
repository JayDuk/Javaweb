package com.javaweb.dao.impl;

import com.javaweb.dao.UserDAO;
import com.mvc.dao.BaseDAO;
import com.javaweb.pojo.User;
import com.mvc.annotation.Component;

import java.sql.SQLException;
import java.util.List;

/**
 * @author javaok
 * 2022/11/28 23:42
 */
@Component
public class UserDAOImpl extends BaseDAO<User> implements UserDAO {
    @Override
    public User getUserByAccount(String account) {
        try {
            return super.query("SELECT * FROM user_table  WHERE account = ? ", account);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getUsers() {
        try {
            return super.queries("SELECT * FROM user_table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addUser(User user) {
        try {
            super.update("INSERT INTO user_table(nickname,account,password) VALUES(?,?,?)",
                    user.getNickname(), user.getAccount(), user.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
