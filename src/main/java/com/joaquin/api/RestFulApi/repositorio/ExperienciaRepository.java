package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
}
