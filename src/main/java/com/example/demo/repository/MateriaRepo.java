package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Materia;

public interface MateriaRepo {
	
	public void insertar (Materia materia);
	public List <Materia> buscarTodos();

}
