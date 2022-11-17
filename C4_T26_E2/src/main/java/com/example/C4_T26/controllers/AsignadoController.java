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

import com.example.C4_T26.dto.Asignado;
import com.example.C4_T26.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignados")
	public List<Asignado> listarAsignados(){
		return asignadoServiceImpl.listarAsignados();
	}
	
	@PostMapping("/asignados")
	public Asignado salvarAsignado(@RequestBody Asignado asignado) {
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	@GetMapping("/asignados/{id}")
	public Asignado AsignadoXID(@PathVariable(name = "id") int id) {
		return asignadoServiceImpl.asignadoXID(id);
	}
	
	@PutMapping("asignados/{id}")
	public Asignado actualizarAsignado(@PathVariable(name = "id") int id, @RequestBody Asignado asignado) {
		Asignado asi_s = new Asignado();
		Asignado asi_a = new Asignado();
		
		asi_s = asignadoServiceImpl.asignadoXID(id);
		
		asi_s.setCientifico(asignado.getCientifico());
		asi_s.setProyecto(asignado.getProyecto());
		
		asi_a = asignadoServiceImpl.actualizarAsignado(asi_s);
		
		System.out.println("Suministra actualizada:" + asi_a);
		
		return asi_a;
	}
	
	@DeleteMapping("/asignados/{id}")
	public void eliminarAsignado(@PathVariable(name = "id") int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
}
