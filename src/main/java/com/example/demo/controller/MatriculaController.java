package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/ingresar")
	public String matricular(Model model) {
		Matricula matri = new Matricula ();
		model.addAttribute("matricula",matri);
		List<Matricula> lista = this.matriculaService.seleccionarTodos();
		model.addAttribute("matriculas",lista);
		return "vistaMatricula";		
	}
	
	@PostMapping("/guardar")
	public String guardar (@ModelAttribute("matricula") Matricula matricula) {
		matriculaService.guardar(matricula);
		return "vistaPrincipal";
	}

}
