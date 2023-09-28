package com.saude.pedroreis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saude.pedroreis.models.Especialidade;

@Repository
public interface RepositoryEspecialidade extends JpaRepository<Especialidade, Integer>{

}
