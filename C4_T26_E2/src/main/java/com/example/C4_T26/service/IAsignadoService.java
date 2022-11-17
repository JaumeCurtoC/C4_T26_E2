package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Asignado;

public interface IAsignadoService {

	// Metodos CRUD
	//Listar
	public List<Asignado> listarAsignados();
	
	// CREATE
	public Asignado guardarAsignado(Asignado asignado);
	
	// READ
	public Asignado asignadoXID(int id);
	
	// UPDATE
	public Asignado actualizarAsignado(Asignado asignado);
	
	// DELETE
	public void eliminarAsignado(int id);
	
}
