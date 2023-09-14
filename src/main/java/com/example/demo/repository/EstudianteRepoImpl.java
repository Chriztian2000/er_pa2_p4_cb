package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Estudiante estudiante) {		
		this.entityManager.persist(estudiante);		
	}


	@Override
	public List<Estudiante> buscarTodos() {
		TypedQuery<Estudiante> query = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return query.getResultList();
	}

}
