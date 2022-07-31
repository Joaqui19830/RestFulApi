package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void editarPersona(Persona per);

}
