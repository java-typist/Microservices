package com.jason.user.model;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:42
 * @Modify 2019/8/19 11:42
 * @Version 1.0
 */
public class Manage {
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

    @Override
    public String toString() {
        return "Manage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }
}
