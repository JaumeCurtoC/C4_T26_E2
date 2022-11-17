package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IAsignadoDAO;
import com.example.C4_T26.dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService{

	@Autowired
	IAsignadoDAO asignadoDAO;

	@Override
	public List<Asignado> listarAsignados() {
		// TODO Auto-generated method stub
		return asignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return asignadoDAO.save(asignado);
	}

	@Override
	public Asignado asignadoXID(int id) {
		// TODO Auto-generated method stub
		return asignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return asignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(int id) {
		// TODO Auto-generated method stub
		asignadoDAO.deleteById(id);
	}
}
