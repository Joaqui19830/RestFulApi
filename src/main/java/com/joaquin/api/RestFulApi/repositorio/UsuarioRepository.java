package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
