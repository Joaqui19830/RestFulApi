package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEducacionService {


    public List<Educacion> verEducacion();



    public void deleteEducacion(Long id);




    Educacion educacionResponse(Educacion edu);

    public void save(Educacion educacion);
}
