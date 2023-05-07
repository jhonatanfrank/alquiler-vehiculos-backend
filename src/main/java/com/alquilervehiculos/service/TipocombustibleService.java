package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Tipocombustible;

public interface TipocombustibleService {
	public Tipocombustible save(Tipocombustible tipocombustible);

	public Tipocombustible findById(Integer id);

	public List<Tipocombustible> findAll();

	public void delete(Integer id);
	
	public List<Tipocombustible> findByVehiculoId(Integer id);
}
