package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.repository.MateriaRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaRepo materiaRepo;

	@Override
	public void guardar(Materia materia) {
		this.materiaRepo.insertar(materia);

	}
	
	@Override
	public List<Materia> seleccionarTodos() {		
		return this.materiaRepo.buscarTodos();
	}
}
