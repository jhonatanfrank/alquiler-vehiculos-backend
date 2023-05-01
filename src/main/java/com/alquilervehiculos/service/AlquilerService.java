package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.alquilervehiculos.model.Alquiler;

public interface AlquilerService {

	public Alquiler save(Alquiler alquiler);

	public Alquiler findById(Integer id);

	public List<Alquiler> findAll();

	public void delete(Integer id);

}
