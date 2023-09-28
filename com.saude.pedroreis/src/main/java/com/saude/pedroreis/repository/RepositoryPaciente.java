package com.saude.pedroreis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saude.pedroreis.models.Paciente;

@Repository
public interface RepositoryPaciente extends JpaRepository<Paciente, Integer> {

}
