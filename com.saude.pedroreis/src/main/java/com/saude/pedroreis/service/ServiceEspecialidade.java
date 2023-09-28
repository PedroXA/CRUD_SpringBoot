package com.saude.pedroreis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude.pedroreis.models.Especialidade;
import com.saude.pedroreis.repository.RepositoryEspecialidade;

@Service
public class ServiceEspecialidade {
	
	@Autowired
	private RepositoryEspecialidade repositoryespecialidade;

	public void salvarEspecialidade(Especialidade especialidade) {
		repositoryespecialidade.save(especialidade);
	}

	public List<Especialidade> listALL() {
		return repositoryespecialidade.findAll();
	}

	public Optional<Especialidade> getEspecialidade(int ID) {
		return repositoryespecialidade.findById(ID);
	}

	public void excluirEspecialidade(Especialidade especialidade) {
		repositoryespecialidade.delete(especialidade);
	}
}
