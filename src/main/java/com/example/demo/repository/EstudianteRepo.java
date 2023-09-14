package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface EstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	public List <Estudiante> buscarTodos();
}
