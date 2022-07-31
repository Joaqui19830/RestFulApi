package com.joaquin.api.RestFulApi.controller;

import com.joaquin.api.RestFulApi.models.Educacion;
import com.joaquin.api.RestFulApi.models.Experiencia;
import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.servicio.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolio-firebase-699b9.web.app")
public class ExpeController {

    @Autowired
    IExperienciaService iExperienciaService;

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
        return iExperienciaService.verExperiencia();
    }

    @PostMapping("/new/experiencia")
    public Response<Experiencia> experienciaResponse(@RequestBody Experiencia exp){
        Experiencia expe = iExperienciaService.experienciaResponse(exp);

        if (exp != null){
                iExperienciaService.save(exp);
            return new Response<Experiencia>(true, "Nueva experiencia agregada", exp);
        }
        return  new Response<Experiencia>(true, "Año de ingreso y egreso no son corrrectos", null);
    }

    @DeleteMapping("/experiencia/delete/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
      iExperienciaService.deleteExperiencia(id);
        return "La experiencia fue borrada";
    }
}
