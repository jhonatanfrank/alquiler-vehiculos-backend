package com.alquilervehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.model.Tipomanejo;
import com.alquilervehiculos.service.MarcaService;
import com.alquilervehiculos.service.TipomanejoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class TipomanejoController {
	@Autowired
	private TipomanejoService tipomanejoService;
	
	@PostMapping("/tiposmanejo")
	public Tipomanejo save(@RequestBody Tipomanejo tipomanejo) {
		return tipomanejoService.save(tipomanejo);
	}
	
	@GetMapping("/tiposmanejo")
	public List<Tipomanejo> tipomanejo() {
		return tipomanejoService.findAll();
	}
	
	@GetMapping("/tiposmanejo/{id}")
	public Tipomanejo mostrar(@PathVariable Integer id) {
		return tipomanejoService.findById(id);
	}
	
	
	@PutMapping("/tiposmanejo/{id}")
	public Tipomanejo update(@RequestBody Tipomanejo tipomanejo, @PathVariable Integer id) {
		Tipomanejo tipomanejoActual = tipomanejoService.findById(id);
		
		tipomanejoActual.setTipomanejo(tipomanejo.getTipomanejo());

		return tipomanejoService.save(tipomanejoActual);
	}
	
	@DeleteMapping("/tiposmanejo/{id}")
	public void delete(@PathVariable Integer id) {
		tipomanejoService.delete(id);
	}
}
