package com.alquilervehiculos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alquilervehiculos.model.Alquiler;

public interface AlquilerDao extends JpaRepository<Alquiler, Integer> {
	@Query("SELECT a FROM Alquiler a WHERE a.vehiculo.placa = :placa")
    List<Alquiler> findByVehiculoPlaca(@Param("placa") String placa);
}
