package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.EstudianteRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);		
	}

	@Override
	public List<Estudiante> seleccionarTodos() {		
		return this.estudianteRepo.buscarTodos();
	}
	
}
