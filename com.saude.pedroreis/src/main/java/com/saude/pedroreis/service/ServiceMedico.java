package com.saude.pedroreis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude.pedroreis.models.Medico;
import com.saude.pedroreis.repository.RepositoryMedico;

@Service
public class ServiceMedico {
	
	@Autowired
	private RepositoryMedico repositorymedico;

	public void salvarMedico(Medico medico) {
		repositorymedico.save(medico);
	}

	public List<Medico> listALL() {
		return repositorymedico.findAll();
	}

	public Optional<Medico> getMedico(int ID) {
		return repositorymedico.findById(ID);
	}

	public void excluirMedico(Medico medico) {
		repositorymedico.delete(medico);
	}
}
