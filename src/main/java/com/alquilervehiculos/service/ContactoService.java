package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Contacto;

public interface ContactoService {
	
	public Contacto save(Contacto contacto);
	
	public void delete(Integer id);
	
	public Contacto findById(Integer id);
	
	public List<Contacto> findAll();
}
