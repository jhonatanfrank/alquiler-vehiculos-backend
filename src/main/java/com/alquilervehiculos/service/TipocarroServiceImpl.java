package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.TipocarroDao;
import com.alquilervehiculos.model.Tipocarro;

@Service
public class TipocarroServiceImpl implements TipocarroService{

	@Autowired
	private TipocarroDao tipocarroDao;

	@Override
	public Tipocarro save(Tipocarro tipocarro) {
		return tipocarroDao.save(tipocarro);

	}

	@Override
	public Tipocarro findById(Integer id) {
		return tipocarroDao.findById(id).orElse(null);

	}

	@Override
	public List<Tipocarro> findAll() {
		return (List<Tipocarro>) tipocarroDao.findAll();//error aqui

	}

	@Override
	public void delete(Integer id) {
		tipocarroDao.deleteById(id);		
	}

	@Override
	public List<Tipocarro> findByVehiculoId(Integer id) {
		return (List<Tipocarro>) tipocarroDao.findById(id).orElse(null);
	}
}
