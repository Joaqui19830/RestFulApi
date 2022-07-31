package com.joaquin.api.RestFulApi.repositorio;

import com.joaquin.api.RestFulApi.models.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<Social, Long> {
}
