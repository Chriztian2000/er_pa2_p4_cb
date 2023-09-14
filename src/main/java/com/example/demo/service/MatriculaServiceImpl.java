package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.repository.MatriculaRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepo matriculaRepo;
	
	@Override
	public void guardar(Matricula matricula) {
		this.matriculaRepo.insertar(matricula);
		
	}

	@Override
	public List<Matricula> seleccionarTodos() {
	
		return this.matriculaRepo.buscarTodos();
	}

}
