package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Vehiculo;

public interface VehiculoService {

	public Vehiculo save(Vehiculo vehiculo);
	
	public void delete(Integer id);
	
	public Vehiculo findById(Integer id);
	
	public List<Vehiculo> findAll();
	
}
