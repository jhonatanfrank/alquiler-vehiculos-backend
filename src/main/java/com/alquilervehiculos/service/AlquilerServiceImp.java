package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.AlquilerDao;
import com.alquilervehiculos.model.Alquiler;

@Service
public class AlquilerServiceImp implements AlquilerService{

	
	@Autowired
	private AlquilerDao alquilerDao;
	
	@Override
	public Alquiler save(Alquiler alquiler) {
		return alquilerDao.save(alquiler);
	}

	@Override
	public Alquiler findById(Integer id) {
		return alquilerDao.findById(id).orElse(null);
	}

	
	@Override
	public List<Alquiler> findAll() {
		return alquilerDao.findAll();
	}

	@Override
	public void delete(Integer id) {
		alquilerDao.deleteById(id);
	}

}
