package com.saude.pedroreis.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saude.pedroreis.models.Consulta;
import com.saude.pedroreis.service.ServiceConsulta;
import com.saude.pedroreis.service.ServiceMedico;
import com.saude.pedroreis.service.ServicePaciente;

@Controller
@RequestMapping("/consultas")
public class ControllerConsulta {
	@Autowired
	private ServiceConsulta serviceConsulta;
	@Autowired
	private ServiceMedico serviceMedico;
	@Autowired
	private ServicePaciente servicePaciente;

	@GetMapping(value = "")
	public String listAll(Model model) {	
		model.addAttribute("consulta", serviceConsulta.listALL());
		return "consultas";
	}

	@GetMapping("/novaconsulta")
	public String novoComputador(Model model) {

		model.addAttribute("medicos", serviceMedico.listALL());
		model.addAttribute("pacientes", servicePaciente.listALL());
		model.addAttribute("consulta", new Consulta());

		return "novaconsulta";
	}

	@PostMapping("/salvar")
	public String salvar(@ModelAttribute Consulta consultas) {
		serviceConsulta.salvarConsulta(consultas);
		return "redirect:/consultas";
	}
	
	@GetMapping("/excluir/{codigo}")
	public String excluirConsulta(@PathVariable("codigo") int codigo) {
		
		Optional<Consulta> optionalconsulta = serviceConsulta.getConsulta(codigo);
		
		if (optionalconsulta.isPresent()) {
			serviceConsulta.excluirConsulta(optionalconsulta.get());
		}
		
		return "redirect:/consultas";
	}
	
	@GetMapping("/editar/{codigo}")
	public String editarConsulta(@PathVariable("codigo") int codigo, Model model) {
	
		Optional<Consulta> optinalconsulta = serviceConsulta.getConsulta(codigo);
		
		model.addAttribute("consulta", serviceConsulta.getConsulta(codigo).get());
		
		model.addAttribute("medicos", serviceMedico.listALL());
		model.addAttribute("pacientes", servicePaciente.listALL());
		
		return "novaconsulta";
	}

}
