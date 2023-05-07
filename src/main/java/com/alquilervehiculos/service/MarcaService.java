package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Marca;

public interface MarcaService {

	public Marca save(Marca marca);

	public Marca findById(Integer id);

	public List<Marca> findAll();

	public void delete(Integer id);
	
	public List<Marca> findByVehiculoId(Integer id);
}
