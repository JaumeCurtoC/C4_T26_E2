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

import com.example.C4_T26.dto.Proyecto;
import com.example.C4_T26.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto ProyectoXID(@PathVariable(name = "id") int id) {
		return proyectoServiceImpl.proyectoXID(id);
	}
	
	@PutMapping("proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") int id, @RequestBody Proyecto proyecto) {
		Proyecto pro_s = new Proyecto();
		Proyecto pro_a = new Proyecto();
		
		pro_s = proyectoServiceImpl.proyectoXID(id);
		
		pro_s.setNombre(proyecto.getNombre());
		pro_s.setHoras(proyecto.getHoras());
		
		pro_a = proyectoServiceImpl.actualizarProyecto(pro_s);
		
		System.out.println("Proyecto actualizada:" + pro_a);
		
		return pro_a;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") int id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}
