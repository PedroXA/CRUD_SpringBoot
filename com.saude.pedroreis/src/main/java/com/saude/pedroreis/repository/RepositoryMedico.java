package com.saude.pedroreis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saude.pedroreis.models.Medico;

@Repository
public interface RepositoryMedico extends JpaRepository<Medico, Integer> {

}
