package com.javaweb.dao.impl;

import com.javaweb.dao.FileDAO;
import com.mvc.dao.BaseDAO;
import com.javaweb.pojo.File;
import com.mvc.annotation.Component;


import java.sql.SQLException;
import java.util.List;

/**
 * @author javaok
 * 2022/11/28 23:49
 */
@Component
public class FileDAOImpl extends BaseDAO<File> implements FileDAO {

    @Override
    public List<File> getFiles() {
        try {
            return super.queries("SELECT * FROM file_table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
