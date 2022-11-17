package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.ICientificoDAO;
import com.example.C4_T26.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDAO cientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		// TODO Auto-generated method stub
		return cientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(int id) {
		// TODO Auto-generated method stub
		return cientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(int id) {
		// TODO Auto-generated method stub
		cientificoDAO.deleteById(id);
	}
}
