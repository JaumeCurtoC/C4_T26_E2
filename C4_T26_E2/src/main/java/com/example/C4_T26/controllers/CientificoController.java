package com.example.C4_T26.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T26.dto.Cientifico;
import com.example.C4_T26.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico CientificoXID(@PathVariable(name = "id") int id) {
		return cientificoServiceImpl.cientificoXID(id);
	}
	
	@PutMapping("cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") int id, @RequestBody Cientifico cientifico) {
		Cientifico cie_s = new Cientifico();
		Cientifico cie_a = new Cientifico();
		
		cie_s = cientificoServiceImpl.cientificoXID(id);
		
		cie_s.setNomApels(cientifico.getNomApels());
		
		cie_a = cientificoServiceImpl.actualizarCientifico(cie_s);
		
		System.out.println("Cientifico actualizada:" + cie_a);
		
		return cie_a;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") int id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
}
