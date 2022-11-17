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
@Table(name = "cientificos")
public class Cientifico {
	
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nomApels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado> asignados;
	
	//------------------CONSTRUCTORES----------------------------

	public Cientifico() {
		
	}

	public Cientifico(int id, String nomApels, List<Asignado> asignados) {
		this.id = id;
		this.nomApels = nomApels;
		this.asignados = asignados;
	}
	
	//----------------GETTERS Y SETTERS------------------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
		return "Cientifico [id=" + id + ", nomApels=" + nomApels + "]";
	}
	
}
