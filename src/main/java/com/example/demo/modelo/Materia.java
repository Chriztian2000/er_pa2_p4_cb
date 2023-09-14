package com.example.demo.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia_web")
public class Materia {
	
	@Id
	@SequenceGenerator(name = "seq_mate", sequenceName = "seq_mate", allocationSize = 1)
	@GeneratedValue(generator = "seq_mate", strategy = GenerationType.SEQUENCE)
	@Column(name = "mate_id")
	private Integer id;
	
	@Column(name = "mate_nombre")
	private String nombre;
	
	@Column (name = "mate_codigo")
	private String codigo;
	
	@Column (name = "mate_descripcion")
	private String descripcion;
	
	@Column (name = "mate_numerocreditos")
	private Integer numeroCreditos;
	
	@Column (name = "mate_numeroestudiantes")
	private Integer numeroEstudiantes=0;
	
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matriculaList = new ArrayList<>();
	
	
	
	
	
	//GET Y SET	
	
	public Integer getId() {
		return id;
	}

	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", numeroCreditos=" + numeroCreditos + "]";
	}
	
	

}
