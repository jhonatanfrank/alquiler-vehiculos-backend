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

import com.alquilervehiculos.model.Contacto;
import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.service.ContactoService;
import com.alquilervehiculos.service.MarcaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;
	
	@PostMapping("/marcas")
	public Marca save(@RequestBody Marca marca) {
		return marcaService.save(marca);
	}
	
	@GetMapping("/marcas")
	public List<Marca> marca() {
		return marcaService.findAll();
	}
	
	@GetMapping("/marcas/{id}")
	public Marca mostrar(@PathVariable Integer id) {
		return marcaService.findById(id);
	}
	
	
	@PutMapping("/marcas/{id}")
	public Marca update(@RequestBody Marca marca, @PathVariable Integer id) {
		Marca marcaActual = marcaService.findById(id);
		
		marcaActual.setMarca(marca.getMarca());

		return marcaService.save(marcaActual);
	}
	
	@DeleteMapping("/marcas/{id}")
	public void delete(@PathVariable Integer id) {
		marcaService.delete(id);
	}
	
}
