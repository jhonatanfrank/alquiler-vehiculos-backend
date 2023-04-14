package com.alquilervehiculos.dao;

import org.springframework.data.repository.CrudRepository;

import com.alquilervehiculos.model.Cliente;

public interface ClienteDao extends CrudRepository <Cliente, Integer> {

}
