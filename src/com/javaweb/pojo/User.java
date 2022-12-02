package com.javaweb.pojo;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author javaok
 * 2022/11/28 23:27
 */
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;

    public User() {
    }

    public User(String nickname, String account, String password) {
        this.nickname = nickname;
        this.account = account;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
