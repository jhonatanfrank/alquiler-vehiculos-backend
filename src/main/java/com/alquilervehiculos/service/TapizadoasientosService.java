package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Tapizadoasientos;

public interface TapizadoasientosService {

	public Tapizadoasientos save(Tapizadoasientos tapizadoasientos);

	public Tapizadoasientos findById(Integer id);

	public List<Tapizadoasientos> findAll();

	public void delete(Integer id);
	
	public List<Tapizadoasientos> findByVehiculoId(Integer id);
}
