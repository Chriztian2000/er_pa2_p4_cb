package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula_web")
public class Matricula {
	
	@Id
	@SequenceGenerator(name = "seq_matri", sequenceName = "seq_matri", allocationSize = 1)
	@GeneratedValue(generator = "seq_matri", strategy = GenerationType.SEQUENCE)
	@Column(name = "matri_id")
	private Integer id;
	@Column(name = "matri_fechamatricula")
	private LocalDateTime fechaMatricula;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_matri")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "materia_matri")
	private Materia materia;
	
	
	

}
