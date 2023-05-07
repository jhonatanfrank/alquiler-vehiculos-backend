package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.TipocombustibleDao;
import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.model.Tipocombustible;

@Service
public class TipocombustibleServiceImpl implements TipocombustibleService{

	@Autowired
	private TipocombustibleDao tipocombustibleDao;

	@Override
	public Tipocombustible save(Tipocombustible tipocombustible) {
		return tipocombustibleDao.save(tipocombustible);
	}

	@Override
	public Tipocombustible findById(Integer id) {
		return tipocombustibleDao.findById(id).orElse(null);

	}

	@Override
	public List<Tipocombustible> findAll() {
		return (List<Tipocombustible>) tipocombustibleDao.findAll();
	}

	@Override
	public void delete(Integer id) {
		tipocombustibleDao.deleteById(id);
		
	}

	@Override
	public List<Tipocombustible> findByVehiculoId(Integer id) {
		return (List<Tipocombustible>) tipocombustibleDao.findById(id).orElse(null);
	}
	


}
