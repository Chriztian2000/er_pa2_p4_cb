package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Materia;
import com.example.demo.service.MateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;
	
	@GetMapping("/ingresar")
	public String ingresarMateria (Model model) {		
		Materia mate = new Materia ();		
		model.addAttribute("materia",mate);
		List<Materia> lista = this.materiaService.seleccionarTodos();
		model.addAttribute("estudiantes",lista);
		return "vistaIngresarMateria";
	}
	
	@PostMapping("/guardar")	
	public String guardarMateria (@ModelAttribute("materia")Materia materia) {
		materiaService.guardar(materia);
		return "redirect:/materias/lista";
	}
	
	@GetMapping("/lista")
	public String listarMateria(Model model) {
		List<Materia> lista = materiaService.seleccionarTodos();
		model.addAttribute("materias", lista);
		return "vistaListaMaterias";
	}
	
	
	
	
	

}
