package com.joaquin.api.RestFulApi.controller;

import com.joaquin.api.RestFulApi.models.Persona;
import com.joaquin.api.RestFulApi.servicio.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolio-firebase-699b9.web.app")
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @PostMapping("/edit/personas")
    public void editarPersona(@RequestBody Persona pers){

        persoServ.editarPersona(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }



}
