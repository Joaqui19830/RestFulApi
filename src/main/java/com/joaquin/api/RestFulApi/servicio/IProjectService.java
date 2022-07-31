package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Project;

import java.util.List;

public interface IProjectService {

    public List<Project> verProject();

    public void deleteProject(Long id);

    Project projectResponse(Project pro);

    public void save(Project project);

}
