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
 * 2022/11/30 21:15
 */
@Component
@Controller
@RequestMapping("/register")
public class RegisterController {
    @AutoWired
    LoginService loginService;

    @RequestMapping
    String registerPage() {
        return FORWARD + "/static/register.html";
    }

    @RequestMapping("/do")
    String register(String nickname, String account, String password) {
        loginService.register(nickname, account, password);
        return REDIRECT + "/javaweb/login";
    }
}
