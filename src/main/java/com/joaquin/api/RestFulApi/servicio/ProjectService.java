package com.joaquin.api.RestFulApi.servicio;


import com.joaquin.api.RestFulApi.models.Project;

import com.joaquin.api.RestFulApi.repositorio.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService{

    @Autowired
    ProjectRepository projectRepository;
    @Override
    public List<Project> verProject() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProject(Long id) {
    projectRepository.deleteById(id);
    }

    @Override
    public Project projectResponse(Project pro) {
        List<Project> listPro =  projectRepository.findAll();
        for(Project proj: listPro){
            if(proj.getNameProject().equals(pro.getNameProject()) && proj.getImgProject().equals(pro.getImgProject())){
                return proj;
            }
        }
        return null;
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }


}
