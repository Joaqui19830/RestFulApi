package com.joaquin.api.RestFulApi.controller;

import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.models.Social;
import com.joaquin.api.RestFulApi.models.Usuario;
import com.joaquin.api.RestFulApi.servicio.IUsuarioService;
import com.joaquin.api.RestFulApi.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/login")
    public Response<Usuario> login(@RequestBody Usuario user) {

        Usuario us = usuarioService.login(user);

        if (us != null) {
            return new Response(true, "Bienvenido!", us);
        }
        return new Response(false, "Usuario o contraseña incorrecta", null);
    }




}
