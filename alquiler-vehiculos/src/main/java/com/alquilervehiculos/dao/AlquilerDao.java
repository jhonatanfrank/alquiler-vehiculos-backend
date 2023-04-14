package com.alquilervehiculos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alquilervehiculos.model.Alquiler;

public interface AlquilerDao extends JpaRepository<Alquiler, Integer> {

}
