package com.example.C4_T26.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proyectos")
public class Proyecto {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horas")
	private int horas;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado> asignados;
	
	//------------------CONSTRUCTORES----------------------------

	public Proyecto() {

	}

	public Proyecto(int id, String nombre, List<Asignado> asignados) {
		this.id = id;
		this.nombre = nombre;
		this.asignados = asignados;
	}
	
	//----------------GETTERS Y SETTERS------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignados() {
		return asignados;
	}

	public void setAsignados(List<Asignado> asignados) {
		this.asignados = asignados;
	}

	//------------------------TOSTRING-----------------------------
	
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
