package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
