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
import com.alquilervehiculos.model.Tipocombustible;
import com.alquilervehiculos.service.MarcaService;
import com.alquilervehiculos.service.TipocombustibleService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class TipocombustibleController {
	@Autowired
	private TipocombustibleService tipocombustibleService;
	
	@PostMapping("/tiposcombustible")
	public Tipocombustible save(@RequestBody Tipocombustible tipocombustible) {
		return tipocombustibleService.save(tipocombustible);
	}
	
	@GetMapping("/tiposcombustible")
	public List<Tipocombustible> marca() {
		return tipocombustibleService.findAll();
	}
	
	@GetMapping("/tiposcombustible/{id}")
	public Tipocombustible mostrar(@PathVariable Integer id) {
		return tipocombustibleService.findById(id);
	}
	
	
	@PutMapping("/tiposcombustible/{id}")
	public Tipocombustible update(@RequestBody Tipocombustible tipocombustible, @PathVariable Integer id) {
		Tipocombustible tipocombustibleActual = tipocombustibleService.findById(id);
		
		tipocombustibleActual.setTipocombustible(tipocombustible.getTipocombustible());

		return tipocombustibleService.save(tipocombustibleActual);
	}
	
	@DeleteMapping("/tiposcombustible/{id}")
	public void delete(@PathVariable Integer id) {
		tipocombustibleService.delete(id);
	}
}
