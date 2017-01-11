package com.jedlab.pm.prime;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jedlab.pm.model.Project;
import com.jedlab.pm.service.ProjectService;

@Component("projectActionBean")
@RequestScoped
public class ProjectActionBean
{

    @Autowired
    ProjectService projectService;

    Project project = new Project();

    public Project getProject()
    {
        return project;
    }

    public void createProject()
    {
        projectService.persist(getProject());
        project = new Project();
    }

}
