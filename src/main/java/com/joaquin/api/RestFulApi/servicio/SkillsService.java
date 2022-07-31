package com.joaquin.api.RestFulApi.servicio;



import com.joaquin.api.RestFulApi.models.Skills;
import com.joaquin.api.RestFulApi.repositorio.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService implements ISkillsService {

    @Autowired
    SkillsRepository skillsRepository;

    @Override
    public List<Skills> verSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepository.deleteById(id);
    }



    @Override
    public Skills skillsResponse(Skills sk) {
        List<Skills> listSki =  skillsRepository.findAll();
        for(Skills skil: listSki){
            if(skil.getNameSkill().equals(sk.getNameSkill()) && skil.getImgSkill().equals(sk.getImgSkill())){
                return skil;
            }
        }
        return null;
    }

    @Override
    public void save(Skills skills) {
        skillsRepository.save(skills);
    }
}
