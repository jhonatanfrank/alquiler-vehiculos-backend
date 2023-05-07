package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Tipocarro;

public interface TipocarroService {
	
	public Tipocarro save(Tipocarro tipocarro);

	public Tipocarro findById(Integer id);

	public List<Tipocarro> findAll();

	public void delete(Integer id);
	
	public List<Tipocarro> findByVehiculoId(Integer id);
}
