package com.javaweb.dao;

import com.javaweb.pojo.File;

import java.util.List;

/**
 * @author javaok
 * 2022/11/28 23:48
 */
public interface FileDAO {
    /**
     * get files
     *
     * @return file list
     */
    List<File> getFiles();
}
