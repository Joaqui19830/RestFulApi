package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Experiencia;

import com.joaquin.api.RestFulApi.repositorio.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> verExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }


    @Override
    public Experiencia experienciaResponse(Experiencia exp) {
        List<Experiencia> listExp =  experienciaRepository.findAll();
        for(Experiencia expe: listExp){
            if(expe.getNombrePosition().equals(exp.getNombrePosition()) && expe.getDescriptionPosition().equals(exp.getDescriptionPosition())){
                return expe;
            }
        }
        return null;
    }

    @Override
    public void save(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
}
