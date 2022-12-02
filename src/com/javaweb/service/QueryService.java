package com.javaweb.service;

import com.javaweb.dao.FileDAO;
import com.javaweb.dao.UserDAO;
import com.javaweb.dao.impl.FileDAOImpl;
import com.javaweb.dao.impl.UserDAOImpl;
import com.javaweb.pojo.File;
import com.javaweb.pojo.User;
import com.mvc.annotation.AutoWired;
import com.mvc.annotation.Component;

import java.util.List;

/**
 * @author javaok
 * 2022/11/29 15:53
 */
@Component
public class QueryService {

    @AutoWired(FileDAOImpl.class)
    FileDAO fileDAO;

    public List<File> getFiles() {
        return fileDAO.getFiles();
    }
}
