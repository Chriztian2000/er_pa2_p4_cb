package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface EstudianteService {
	
	public void insertar(Estudiante estudiante);
	public List <Estudiante> seleccionarTodos();

}
