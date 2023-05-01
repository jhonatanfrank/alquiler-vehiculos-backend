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

import com.alquilervehiculos.model.Cliente;
import com.alquilervehiculos.service.ClienteService;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/alquilervehiculos/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/clientes")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}

	@GetMapping("/clientes")
	public List<Cliente> cliente() {
		return clienteService.findAll();
	}

	@GetMapping("/clientes/{id}")
	public Cliente mostrar(@PathVariable Integer id) {
		return clienteService.findById(id);
	}

	@PutMapping("/clientes/{id}")
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id) {
		Cliente clienteActual = clienteService.findById(id);

		clienteActual.setEmail(cliente.getEmail());		
		clienteActual.setPassword(cliente.getPassword());			
		clienteActual.setNombres(cliente.getNombres());
		clienteActual.setApellidos(cliente.getApellidos());
		clienteActual.setPais(cliente.getPais());
		clienteActual.setDistrito(cliente.getDistrito());
		clienteActual.setDireccion(cliente.getDireccion());
		clienteActual.setTelefono(cliente.getTelefono());

		return clienteService.save(clienteActual);
	}

	@DeleteMapping("/clientes/{id}")
	public void delete(@PathVariable Integer id) {
		clienteService.delete(id);
	}

}
