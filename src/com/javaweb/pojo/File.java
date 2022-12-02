package com.javaweb.pojo;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author javaok
 * 2022/11/28 23:37
 */

public class File implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件大小，单位k
     */
    private Float size;
    /**
     * 信息
     */
    private String describe;
    /**
     * 添加文件的时间
     */
    private LocalDateTime updateTime;

    /**
     * 地址目录
     */
    private String address;

    public File() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getSize() {
        return size;
    }

    public String getDescribe() {
        return describe;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public String getAddress() {
        return address;
    }
}
