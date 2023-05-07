package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.MarcaDao;
import com.alquilervehiculos.model.Marca;

@Service
public class MarcaServiceImpl implements MarcaService{

	
	@Autowired
	private MarcaDao marcaDao;
	
	@Override
	public Marca save(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public Marca findById(Integer id) {
		return marcaDao.findById(id).orElse(null);
	}

	@Override
	public List<Marca> findAll() {
		return (List<Marca>) marcaDao.findAll();//error aqui
	}

	@Override
	public void delete(Integer id) {
		marcaDao.deleteById(id);
		
	}

	@Override
	public List<Marca> findByVehiculoId(Integer id) {
		return (List<Marca>) marcaDao.findById(id).orElse(null);
	}

}
