package com.javaweb.service;

import com.javaweb.dao.UserDAO;
import com.javaweb.dao.impl.UserDAOImpl;
import com.javaweb.pojo.User;
import com.mvc.annotation.AutoWired;
import com.mvc.annotation.Component;
import com.mvc.exception.UserCauseException;

import java.util.regex.Pattern;

/**
 * @author javaok
 * 2022/11/29 15:36
 */
@Component
public class LoginService {
    final String ACCOUNT_PATTON = "^\\d{6,10}$";
    final String PASSWORD_PATTON = "^\\w{3,20}$";

    @AutoWired(UserDAOImpl.class)
    private UserDAO userDAO;

    public void login(String account, String password) {
        User user = userDAO.getUserByAccount(account);

        if (user == null) {
            throw new UserCauseException("该用户不存在 " + account);
        } else if (!user.getPassword().equals(password)) {
            throw new UserCauseException("密码错误！");
        }
    }

    public void register(String nickname, String account, String password) {
        if (isDontMatchPattern(account, ACCOUNT_PATTON)) {
            throw new UserCauseException("账号格式错误 " + account);
        } else if (isDontMatchPattern(password, PASSWORD_PATTON)) {
            throw new UserCauseException("密码格式错误 " + password);
        } else if (userDAO.getUserByAccount(account) != null) {
            throw new UserCauseException("该用户已存在 " + account);
        }

        userDAO.addUser(new User(nickname, account, password));
    }

    boolean isDontMatchPattern(String s, String pattern) {
        Pattern regex = Pattern.compile(pattern);
        return !regex.matcher(s).matches();
    }
}
