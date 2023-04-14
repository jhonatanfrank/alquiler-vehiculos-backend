package com.alquilervehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquilervehiculos.model.Alquiler;
import com.alquilervehiculos.model.Cliente;
import com.alquilervehiculos.model.Vehiculo;
import com.alquilervehiculos.service.AlquilerService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/alquilervehiculos/api/")
public class AlquilerController {

	@Autowired
	private AlquilerService alquilerService;

	@GetMapping("/alquileres")
	public ResponseEntity<List<Alquiler>> listarAlquileres() {
		return new ResponseEntity<>(alquilerService.findAll(), HttpStatus.OK);
	}

	/*
	 * @GetMapping("/alquileres") public List<Alquiler> alquileres() { return
	 * alquilerService.findAll(); }
	 */

	@PostMapping("/alquileres")
	public ResponseEntity<Alquiler> crearAlquileres(@RequestBody Alquiler alquiler) {
		return new ResponseEntity<>(alquilerService.save(alquiler), HttpStatus.OK);
	}

	@GetMapping("/alquileres/{id}")
	public Alquiler mostrarCliente(@PathVariable Integer id) {
		return alquilerService.findById(id);
	}

	@PutMapping("/alquileres/{id}")
	public ResponseEntity<Alquiler> actualizarAlquileres(@PathVariable Integer id, @RequestBody Alquiler alquiler) {
		Alquiler alquileresEncontrado = alquilerService.findById(id);
		if (alquileresEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		try {
			alquileresEncontrado.setFechainicio(alquiler.getFechainicio());
			alquileresEncontrado.setHorainicio(alquiler.getHorainicio());
			alquileresEncontrado.setFechafin(alquiler.getFechafin());
			alquileresEncontrado.setHorafin(alquiler.getHorafin());
			alquileresEncontrado.setPrecio(alquiler.getPrecio());
			return new ResponseEntity<>(alquilerService.save(alquileresEncontrado), HttpStatus.CREATED);

		} catch (DataAccessException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/alquileres/{id}")
	public ResponseEntity<?> eliminarAlquileres(@PathVariable Integer id) {
		alquilerService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
