package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Cliente;

public interface ClienteService {

	public Cliente save(Cliente cliente);
	
	public void delete(Integer id);
	
	public Cliente findById(Integer id);
	
	public List<Cliente> findAll();
}
