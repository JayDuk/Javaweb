package com.javaweb.controller;

import com.javaweb.service.LoginService;
import com.mvc.annotation.AutoWired;
import com.mvc.annotation.Component;
import com.mvc.annotation.Controller;
import com.mvc.annotation.RequestMapping;

import static com.mvc.util.StrUtil.FORWARD;
import static com.mvc.util.StrUtil.REDIRECT;

/**
 * @author javaok
 * 2022/11/30 11:28
 */
@Component
@Controller
@RequestMapping("/login")
public class LoginController {
    @AutoWired
    LoginService loginService;

    @RequestMapping
    String loginPage() {
        return FORWARD + "/static/login.html";
    }

    @RequestMapping("/do")
    String login(String account, String password) {
        loginService.login(account, password);
        return REDIRECT + "/javaweb/";
    }


}
