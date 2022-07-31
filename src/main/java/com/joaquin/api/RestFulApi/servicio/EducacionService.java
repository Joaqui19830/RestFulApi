package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.repositorio.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    EducacionRepository educacionRepository;


    @Override
    public List<Educacion> verEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion educacionResponse(Educacion edu) {
        List<Educacion> listEdu =  educacionRepository.findAll();
        for(Educacion educ: listEdu){
            if(educ.getTitle().equals(edu.getTitle()) && educ.getId().equals(edu.getId())){
                return educ;
            }
        }
        return null;
    }


@Override
    public void save(Educacion educacion){
        educacionRepository.save(educacion);
    }
    }



