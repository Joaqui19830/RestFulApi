package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Persona;
import com.joaquin.api.RestFulApi.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
    return persoRepo.findAll();
    }

    @Override
    public void editarPersona(Persona per) {
    persoRepo.save(per);
    }


}
