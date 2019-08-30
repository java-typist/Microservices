package com.jason.project.service;

import com.jason.project.model.Project;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/29 13:41
 * @Modify 2019/8/29 13:41
 * @Version 1.0
 */
public interface ProjectService {

    Project getProject(Integer Id);

    List<Project> getProjects(Integer creatorId);

    List<Project> getProjectsByStatus(Integer... status);

    Integer updateProject(Project project);

    Integer addProject(Project project);
}
