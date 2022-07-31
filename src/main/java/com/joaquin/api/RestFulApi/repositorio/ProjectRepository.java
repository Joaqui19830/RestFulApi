package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
