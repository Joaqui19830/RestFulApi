package com.joaquin.api.RestFulApi.controller;

import com.joaquin.api.RestFulApi.models.Educacion;

import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.servicio.IEducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfolio-firebase-699b9.web.app")
public class EducacionController {

    @Autowired
    IEducacionService iEducacionService;


    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return iEducacionService.verEducacion();
    }


    @PostMapping("/new/educacion")
    public Response<Educacion> educacionResponse(@RequestBody Educacion edu) {

        Educacion educ = iEducacionService.educacionResponse(edu);

        if (edu != null) {
            iEducacionService.save(edu);
            return new Response<Educacion>(true, "Nuevo titulo agregado", edu);

        }
        return new Response<Educacion>(true, "Titulo o id no coinciden", null);

    }

    @DeleteMapping("/educacion/delete/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        iEducacionService.deleteEducacion(id);
        return "La educacion fue borrada";
    }

//    @DeleteMapping ("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id")long id){
//        if(!impEducationService.existById(id)) {
//            return new ResponseEntity(new Mensaje("El ID no Existe"),HttpStatus.BAD_REQUEST);
//            impEducationService.delete(id);


//    @DeleteMapping("/delete/{id}")
//    public void deleteEducacion (@PathVariable Long id){
//        iEducacionService.deleteEducacion(id);
//    }

}

