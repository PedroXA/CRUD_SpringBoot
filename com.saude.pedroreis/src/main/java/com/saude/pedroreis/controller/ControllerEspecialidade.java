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

import com.saude.pedroreis.models.Especialidade;
import com.saude.pedroreis.service.ServiceEspecialidade;
@Controller
@RequestMapping("/especialidade")
public class ControllerEspecialidade {
	
		@Autowired
		private ServiceEspecialidade serviceEspecialidade;

		@GetMapping(value = "")
		public String listAll(Model model) {																																																																																																																																																																																																																										
			model.addAttribute("especialidade", serviceEspecialidade.listALL()); // Object usado no form
			return "especialidade";
		}

		@GetMapping("/novaespecialidade")
		public String novoComputador(Model model) 
		{
			model.addAttribute("especialidades", new Especialidade()); // Object usado no form
			return "novaespecialidade";
		}

		@PostMapping("/salvar")
		public String salvar(@ModelAttribute Especialidade especialidade) {
			serviceEspecialidade.salvarEspecialidade(especialidade);
			return "redirect:/especialidade";
		}
		
		@GetMapping("/excluir/{codigo}")
		public String excluirEspecialidade(@PathVariable("codigo") int codigo) 
		{
			
			Optional<Especialidade> optionalcomputador = serviceEspecialidade.getEspecialidade(codigo);
			
			if (optionalcomputador.isPresent()) {
				serviceEspecialidade.excluirEspecialidade(optionalcomputador.get());
			}
			
			return "redirect:/especialidade";
		}
		
		@GetMapping("/editar/{codigo}")
		public String editarEspecialidade(@PathVariable("codigo") int codigo, Model model) 
		{
			Optional<Especialidade> optinalconsulta = serviceEspecialidade.getEspecialidade(codigo);
			model.addAttribute("especialidades", optinalconsulta.get());
			
			return "novaespecialidade";
		}

	}
