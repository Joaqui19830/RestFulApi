package com.joaquin.api.RestFulApi.servicio;

import com.joaquin.api.RestFulApi.models.Usuario;
import com.joaquin.api.RestFulApi.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public Usuario login(Usuario usuario) {
        List<Usuario> listUser =  usuarioRepo.findAll();
        for(Usuario user : listUser){
            if(user.getUsername().equals(usuario.getUsername()) && user.getPassword().equals(usuario.getPassword())){
                return user;
            }
        }
        return null;
    }



    public void save(Usuario usuario){

    }

}
