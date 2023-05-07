package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.MarcaDao;
import com.alquilervehiculos.dao.TapizadoasientosDao;
import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.model.Tapizadoasientos;

@Service
public class TapizadoasientosServiceImpl implements TapizadoasientosService{
	
	@Autowired
	private TapizadoasientosDao tapizadoasientosDao;
	
	@Override
	public Tapizadoasientos save(Tapizadoasientos tapizadoasientos) {
		return tapizadoasientosDao.save(tapizadoasientos);
	}

	@Override
	public Tapizadoasientos findById(Integer id) {
		return tapizadoasientosDao.findById(id).orElse(null);
	}

	@Override
	public List<Tapizadoasientos> findAll() {
		return (List<Tapizadoasientos>) tapizadoasientosDao.findAll();//error aqui
	}

	@Override
	public void delete(Integer id) {
		tapizadoasientosDao.deleteById(id);		
	}

	@Override
	public List<Tapizadoasientos> findByVehiculoId(Integer id) {
		return (List<Tapizadoasientos>) tapizadoasientosDao.findById(id).orElse(null);
	}

}
