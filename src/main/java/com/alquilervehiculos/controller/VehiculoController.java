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

import com.alquilervehiculos.model.Vehiculo;
import com.alquilervehiculos.service.VehiculoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api/")
public class VehiculoController {

	@Autowired
	private VehiculoService vehiculoService;
	
	
	@PostMapping("/vehiculos")
	public Vehiculo save(@RequestBody Vehiculo vehiculo) {
		return vehiculoService.save(vehiculo);
	}
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> vehiculo() {
		return vehiculoService.findAll();
	}
	
	
	@GetMapping("/vehiculos/{id}")
	public Vehiculo mostrar(@PathVariable Integer id) {
		return vehiculoService.findById(id);
	}
	
	
	@PutMapping("/vehiculos/{id}")
	public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Integer id) {
		Vehiculo vehiculoActual = vehiculoService.findById(id);
		
		vehiculoActual.setPlaca(vehiculo.getPlaca());
		vehiculoActual.setAsientos(vehiculo.getAsientos());
		vehiculoActual.setMarca(vehiculo.getMarca());
		vehiculoActual.setModelo(vehiculo.getModelo());
		vehiculoActual.setAnio(vehiculo.getAnio());
		vehiculoActual.setPrecio(vehiculo.getPrecio());
		vehiculoActual.setEstado(vehiculo.getEstado());
		vehiculoActual.setFoto(vehiculo.getFoto());
		vehiculoActual.setCombustible(vehiculo.getCombustible());
		vehiculoActual.setManejo(vehiculo.getManejo());


		return vehiculoService.save(vehiculoActual);
	}
	
	
	
	@DeleteMapping("/vehiculos/{id}")
	public void delete(@PathVariable Integer id) {
		vehiculoService.delete(id);
	}
	
	
}
