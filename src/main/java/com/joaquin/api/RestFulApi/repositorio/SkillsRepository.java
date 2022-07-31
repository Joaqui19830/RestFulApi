package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
