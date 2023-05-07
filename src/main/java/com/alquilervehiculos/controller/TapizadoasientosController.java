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
import com.alquilervehiculos.model.Tapizadoasientos;
import com.alquilervehiculos.service.TapizadoasientosService;


@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class TapizadoasientosController {
	
	@Autowired
	private TapizadoasientosService tapizadoasientosService;
	
	@PostMapping("/tapizadoasientos")
	public Tapizadoasientos save(@RequestBody Tapizadoasientos tapizadoasientos) {
		return tapizadoasientosService.save(tapizadoasientos);
	}
	
	@GetMapping("/tapizadoasientos")
	public List<Tapizadoasientos> tapizadoasientos() {
		return tapizadoasientosService.findAll();
	}
	
	@GetMapping("/tapizadoasientos/{id}")
	public Tapizadoasientos mostrar(@PathVariable Integer id) {
		return tapizadoasientosService.findById(id);
	}
	
	@PutMapping("/tapizadoasientos/{id}")
	public Tapizadoasientos update(@RequestBody Tapizadoasientos tapizadoasientos, @PathVariable Integer id) {
		Tapizadoasientos tapizadoasientosActual = tapizadoasientosService.findById(id);
		
		tapizadoasientosActual.setTapizadoasientos(tapizadoasientos.getTapizadoasientos());

		return tapizadoasientosService.save(tapizadoasientosActual);
	}
	
	@DeleteMapping("/tapizadoasientos/{id}")
	public void delete(@PathVariable Integer id) {
		tapizadoasientosService.delete(id);
	}
	
}
