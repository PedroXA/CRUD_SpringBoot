package com.saude.pedroreis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saude.pedroreis.models.Consulta;

@Repository
public interface RepositoryConsulta extends JpaRepository<Consulta, Integer>{

}
