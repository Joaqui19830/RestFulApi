package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Skills;

import java.util.List;

public interface ISkillsService {

    public List<Skills> verSkills();



    public void deleteSkills(Long id);


    Skills skillsResponse(Skills sk);

    public void save(Skills skills);
}
