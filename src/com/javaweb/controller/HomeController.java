package com.javaweb.controller;

import com.javaweb.pojo.File;
import com.javaweb.service.QueryService;
import com.mvc.annotation.AutoWired;
import com.mvc.annotation.Component;
import com.mvc.annotation.Controller;
import com.mvc.annotation.RequestMapping;
import com.mvc.thymeleaf.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

import static com.mvc.util.StrUtil.FORWARD;
import static com.mvc.util.StrUtil.REDIRECT;

/**
 * @author javaok
 * 2022/11/29 12:59
 */

@Component
@Controller
@RequestMapping("/")
public class HomeController {

    @AutoWired
    QueryService queryService;

    @RequestMapping
    String getHomePage(HttpSession model) {
        List<File> files = queryService.getFiles();
        model.setAttribute("fileList", files);
        return "file_page";
    }
}

