package com.alquilervehiculos.dao;

import org.springframework.data.repository.CrudRepository;

import com.alquilervehiculos.model.Vehiculo;

public interface VehiculoDao extends CrudRepository<Vehiculo, Integer>{

}
