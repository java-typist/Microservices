package com.jason.project.impl;

import com.jason.project.model.Project;
import com.jason.project.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/29 13:59
 * @Modify 2019/8/29 13:59
 * @Version 1.0
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public Project getProject(Integer Id) {
        return null;
    }

    @Override
    public List<Project> getProjects(Integer creatorId) {
        return null;
    }

    @Override
    public List<Project> getProjectsByStatus(Integer... status) {
        return null;
    }

    @Override
    public Integer updateProject(Project project) {
        return null;
    }

    @Override
    public Integer addProject(Project project) {
        return null;
    }
}
