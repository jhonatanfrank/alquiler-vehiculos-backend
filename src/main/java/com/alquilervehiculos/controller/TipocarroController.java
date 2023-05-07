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
import com.alquilervehiculos.model.Tipocarro;
import com.alquilervehiculos.service.MarcaService;
import com.alquilervehiculos.service.TipocarroService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class TipocarroController {
	
	@Autowired
	private TipocarroService tipocarroService;

	@PostMapping("/tiposcarro")
	public Tipocarro save(@RequestBody Tipocarro tipocarro) {
		return tipocarroService.save(tipocarro);
	}
	
	@GetMapping("/tiposcarro")
	public List<Tipocarro> tipocarro() {
		return tipocarroService.findAll();
	}
	
	@GetMapping("/tiposcarro/{id}")
	public Tipocarro mostrar(@PathVariable Integer id) {
		return tipocarroService.findById(id);
	}
	
	
	@PutMapping("/tiposcarro/{id}")
	public Tipocarro update(@RequestBody Tipocarro tipocarro, @PathVariable Integer id) {
		Tipocarro tipocarroActual = tipocarroService.findById(id);
		
		tipocarroActual.setTipocarro(tipocarro.getTipocarro());

		return tipocarroService.save(tipocarroActual);
	}
	
	@DeleteMapping("/tiposcarro/{id}")
	public void delete(@PathVariable Integer id) {
		tipocarroService.delete(id);
	}
}
