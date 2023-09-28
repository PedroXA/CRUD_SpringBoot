package com.saude.pedroreis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude.pedroreis.models.Consulta;
import com.saude.pedroreis.repository.RepositoryConsulta;

@Service
public class ServiceConsulta {

	@Autowired
	private RepositoryConsulta repositoryconsulta;

	public void salvarConsulta(Consulta consulta) {
		repositoryconsulta.save(consulta);
	}

	public List<Consulta> listALL() {
		return repositoryconsulta.findAll();
	}

	public Optional<Consulta> getConsulta(int ID) {
		return repositoryconsulta.findById(ID);
	}

	public void excluirConsulta(Consulta consulta) {
		repositoryconsulta.delete(consulta);
	}
	

	
}
