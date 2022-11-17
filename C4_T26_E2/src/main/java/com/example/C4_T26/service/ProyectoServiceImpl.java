package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IProyectoDAO;
import com.example.C4_T26.dto.Proyecto;


@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO proyectoDAO;

	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return proyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(int id) {
		// TODO Auto-generated method stub
		return proyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(int id) {
		// TODO Auto-generated method stub
		proyectoDAO.deleteById(id);
	}

	
}
