package com.joaquin.api.RestFulApi.controller;


import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.models.Skills;
import com.joaquin.api.RestFulApi.servicio.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolio-firebase-699b9.web.app")
public class SkillsController {

    @Autowired
    ISkillsService iSkillsService;

    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills() {
        return iSkillsService.verSkills();
    }

    @PostMapping("/new/skills")
    public Response<Skills> skillsResponse(@RequestBody Skills sk) {

        Skills skil = iSkillsService.skillsResponse(sk);

        if (sk != null) {
            iSkillsService.save(sk);
            return new Response<Skills>(true, "Nueva skills agregada", sk);

        }
        return new Response<Skills>(true, "Skills existente", null);

    }

    @DeleteMapping("/skills/delete/{id}")
    public String deleteSkills(@PathVariable Long id) {
        iSkillsService.deleteSkills(id);
        return "La skills fue borrada";
    }

}
