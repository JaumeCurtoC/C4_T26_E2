package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Cientifico;

public interface ICientificoService {

	// Metodos CRUD
	//Listar
	public List<Cientifico> listarCientificos();
	
	// CREATE
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	// READ
	public Cientifico cientificoXID(int id);
	
	// UPDATE
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	// DELETE
	public void eliminarCientifico(int id);
	
}
