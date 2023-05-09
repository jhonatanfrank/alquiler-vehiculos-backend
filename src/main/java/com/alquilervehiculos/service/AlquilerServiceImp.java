package com.alquilervehiculos.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Alquiler> findByVehiculoId(Integer id) {
		// TODO Auto-generated method stub
		return (List<Alquiler>) alquilerDao.findById(id).orElse(null);
	}

	@Override
	public List<Alquiler> findByVehiculoPlaca(String placa) {
		// TODO Auto-generated method stub
		return alquilerDao.findByVehiculoPlaca(placa);
	}

}
