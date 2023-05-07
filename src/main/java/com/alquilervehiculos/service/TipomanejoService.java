package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Tipomanejo;

public interface TipomanejoService {
	
	public Tipomanejo save(Tipomanejo tipomanejo);

	public Tipomanejo findById(Integer id);

	public List<Tipomanejo> findAll();

	public void delete(Integer id);
	
	public List<Tipomanejo> findByVehiculoId(Integer id);
}
