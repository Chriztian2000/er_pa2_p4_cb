package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;

	
	@GetMapping("/ingresar")
	public String ingresarEstudiante (Model model) {		
		Estudiante estu = new Estudiante ();
		model.addAttribute("estudiante",estu);
		List<Estudiante> lista = this.estudianteService.seleccionarTodos();
		model.addAttribute("estudiantes",lista);
		return "vistaIngresarEstudiante";		
	}
	
	@PostMapping("/guardar")
	public String guardarEstudiante (@ModelAttribute("estudiante") Estudiante estudiante) {
		estudianteService.insertar(estudiante);
		return "vistaPrincipal";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	@GetMapping("/lista")
	public String listarProductos(Model model) {
		List<Producto> productos = productoService.seleccionarTodos();
		model.addAttribute("productos", productos);
		return "vistaListaProductos";
	}
	*/
	
	
	

}
