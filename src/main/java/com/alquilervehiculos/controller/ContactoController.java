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
import com.alquilervehiculos.service.ContactoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class ContactoController {

	@Autowired
	private ContactoService contactoService;
	
	@PostMapping("/contactanos")
	public Contacto save(@RequestBody Contacto contacto) {
		return contactoService.save(contacto);
	}
	
	@GetMapping("/contactanos")
	public List<Contacto> contacto() {
		return contactoService.findAll();
	}
	
	@GetMapping("/contactanos/{id}")
	public Contacto mostrar(@PathVariable Integer id) {
		return contactoService.findById(id);
	}
	
	
	@PutMapping("/contactanos/{id}")
	public Contacto update(@RequestBody Contacto contacto, @PathVariable Integer id) {
		Contacto contactoActual = contactoService.findById(id);
		
		contactoActual.setNombres(contacto.getNombres());
		contactoActual.setApellidos(contacto.getApellidos());
		contactoActual.setEmail(contacto.getEmail());
		contactoActual.setCelular(contacto.getCelular());
		contactoActual.setComentarios(contacto.getComentarios());

		return contactoService.save(contactoActual);
	}
	
	@DeleteMapping("/contactanos/{id}")
	public void delete(@PathVariable Integer id) {
		contactoService.delete(id);
	}
	
}
