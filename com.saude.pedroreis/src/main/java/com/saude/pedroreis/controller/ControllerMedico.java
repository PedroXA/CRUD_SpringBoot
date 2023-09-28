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

import com.saude.pedroreis.models.Medico;
import com.saude.pedroreis.service.ServiceEspecialidade;
import com.saude.pedroreis.service.ServiceMedico;

@Controller
@RequestMapping("/medicos")
public class ControllerMedico {
	
		@Autowired
		private ServiceEspecialidade serviceEspecialidade;
		@Autowired
		private ServiceMedico serviceMedico;

		@GetMapping(value = "")
		public String listAll(Model model) 
		{			
			model.addAttribute("medico", serviceMedico.listALL()); // Object
			return "medicos";
		}

		@GetMapping("/novomedico")
		public String novoMedico(Model model) 
		{
			model.addAttribute("medico", new Medico());
			model.addAttribute("especialidades", serviceEspecialidade.listALL());
			return "novomedico";
		}

		@PostMapping("/salvar")
		public String salvar(@ModelAttribute Medico medico) 
		{
			serviceMedico.salvarMedico(medico);
			return "redirect:/medicos";
		}
		
		@GetMapping("/excluir/{codigo}")
		public String excluirMedico(@PathVariable("codigo") int codigo) 
		{
			Optional<Medico> optionalmedico = serviceMedico.getMedico(codigo);
			
			if (optionalmedico.isPresent()) {
				serviceMedico.excluirMedico(optionalmedico.get());
			}
			
			return "redirect:/medicos";
		}
		
		@GetMapping("/editar/{codigo}")
		public String editarMedico(@PathVariable("codigo") int codigo, Model model) 
		{	
			Optional<Medico> optinalmedico = serviceMedico.getMedico(codigo);
			
			model.addAttribute("medico", serviceMedico.getMedico(codigo).get());
			model.addAttribute("especialidades", serviceEspecialidade.listALL());
			return "novomedico";
		}

	}
