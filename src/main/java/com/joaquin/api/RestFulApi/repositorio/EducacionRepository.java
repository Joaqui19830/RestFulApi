package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
//    public Optional<Educacion> findByTitle(String title);
//
//    public boolean existsByTitle(String title);
}
