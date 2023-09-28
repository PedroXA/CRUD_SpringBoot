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

import com.saude.pedroreis.models.Paciente;
import com.saude.pedroreis.service.ServicePaciente;

@Controller
@RequestMapping("/pacientes")
public class ControllerPaciente {
	@Autowired
	private ServicePaciente servicePaciente;
	
	@GetMapping(value = "")
	public String listAll(Model model) 
	{													
		model.addAttribute("paciente", servicePaciente.listALL()); // Object
		return "pacientes";
	}
	
	@GetMapping("/novopaciente")
	public String novoMedico(Model model) 
	{
		model.addAttribute("paciente", new Paciente());
		return "novopaciente";
	}
	
	@PostMapping("/salvar")
	public String salvar(@ModelAttribute Paciente paciente) {
		servicePaciente.salvarPaciente(paciente);
		return "redirect:/pacientes";
	}
	
	@GetMapping("/excluir/{codigo}")
	public String excluirPaciente(@PathVariable("codigo") int codigo) 
	{
		Optional<Paciente> optionalpaciente = servicePaciente.getPaciente(codigo);
		
		if (optionalpaciente.isPresent()) {
			servicePaciente.excluirPaciente(optionalpaciente.get());
		}
		
		return "redirect:/pacientes";
	}
	
	@GetMapping("/editar/{codigo}")
	public String editarPaciente(@PathVariable("codigo") int codigo, Model model) 
	{	
		model.addAttribute("paciente", servicePaciente);
		Optional<Paciente> optionalpaciente = servicePaciente.getPaciente(codigo);
		model.addAttribute("paciente", optionalpaciente.get());
		
		return "novopaciente";
	}

}
