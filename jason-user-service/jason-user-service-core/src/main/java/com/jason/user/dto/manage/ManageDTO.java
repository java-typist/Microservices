package com.jason.user.dto.manage;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 14:50
 * @modify 2019/9/19 14:50
 */
public class ManageDTO {

    private Integer id;
    private String name;
    private String directory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
