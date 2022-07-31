package com.joaquin.api.RestFulApi.controller;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Project;
import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.servicio.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    @Autowired
    IProjectService iProjectService;

    @GetMapping("/ver/project")
    @ResponseBody
    public List<Project> verProject (){
        return iProjectService.verProject();
    }

    @PostMapping("/new/project")
    public Response<Project> projectResponse(@RequestBody Project pro) {

        Project proj= iProjectService.projectResponse(pro);

        if (pro != null) {
            iProjectService.save(pro);
            return new Response<Project>(true, "Nuevo proyecto agregado", pro);

        }
        return new Response<Project>(true, "Ya existe un proyecto con ese nombre", null);

    }

    @DeleteMapping("/project/delete/{id}")
    public String deleteProject(@PathVariable Long id) {
        iProjectService.deleteProject(id);
        return "El proyecto fue borrado";
    }
}
