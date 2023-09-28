package com.saude.pedroreis.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // Informando que é uma entidade do banco
@Table(name = "medico") // Dando um nome para a tabela
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne  // Relacionamento n - 1
	@JoinColumn(name = "especialidade_id", nullable = false) // Join entre o médico e a especialidade
	private Especialidade especialidade;

	private String nome;
	private Integer crm;

	@OneToMany(mappedBy = "medico")
	private List<Consulta> consultas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

}
