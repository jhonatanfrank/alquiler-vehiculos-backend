package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.ClienteDao;
import com.alquilervehiculos.dao.VehiculoDao;
import com.alquilervehiculos.model.Cliente;
import com.alquilervehiculos.model.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{

	@Autowired
	private VehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void delete(Integer id) {
		vehiculoDao.deleteById(id);		
	}

	@Override
	public Vehiculo findById(Integer id) {
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

}
