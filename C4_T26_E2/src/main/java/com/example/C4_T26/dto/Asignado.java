package com.example.C4_T26.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignado_a")
public class Asignado {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientifico cientifico;
	
	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyecto proyecto;
	
	
	//------------------CONSTRUCTORES----------------------------

	public Asignado() {
		
	}

	public Asignado(int id, Cientifico cientifico, Proyecto proyecto, int precio) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}
	
	//----------------GETTERS Y SETTERS------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	//------------------------TOSTRING-----------------------------

	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
}
