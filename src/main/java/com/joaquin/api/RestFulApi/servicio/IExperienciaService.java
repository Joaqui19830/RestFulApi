package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Experiencia;

import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencia();



    public void deleteExperiencia(Long id);


    Experiencia experienciaResponse(Experiencia exp);

    public void save(Experiencia experiencia);
}
