package com.saude.pedroreis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude.pedroreis.models.Paciente;
import com.saude.pedroreis.repository.RepositoryPaciente;

@Service
public class ServicePaciente {
	
	@Autowired
	private RepositoryPaciente repositorypaciente;

	public void salvarPaciente(Paciente paciente) {
		repositorypaciente.save(paciente);
	}

	public List<Paciente> listALL() {
		return repositorypaciente.findAll();
	}

	public Optional<Paciente> getPaciente(int ID) {
		return repositorypaciente.findById(ID);
	}

	public void excluirPaciente(Paciente paciente) {
		repositorypaciente.delete(paciente);
	}
}
