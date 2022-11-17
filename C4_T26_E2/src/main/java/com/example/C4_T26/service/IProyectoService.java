package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Proyecto;

public interface IProyectoService {

	// Metodos CRUD
	//Listar
	public List<Proyecto> listarProyectos();
	
	// CREATE
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	// READ
	public Proyecto proyectoXID(int id);
	
	// UPDATE
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	// DELETE
	public void eliminarProyecto(int id);
	
}
