package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alquilervehiculos.dao.TipomanejoDao;
import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.model.Tipomanejo;

@Service
public class TipomanejoServiceImpl  implements TipomanejoService{

	@Autowired
	private TipomanejoDao tipomanejoDao;
	
	@Override
	public Tipomanejo save(Tipomanejo tipomanejo) {
		// TODO Auto-generated method stub
		return tipomanejoDao.save(tipomanejo);
	}

	@Override
	public Tipomanejo findById(Integer id) {
		// TODO Auto-generated method stub
		return tipomanejoDao.findById(id).orElse(null);
	}

	@Override
	public List<Tipomanejo> findAll() {
		// TODO Auto-generated method stub
		return (List<Tipomanejo>) tipomanejoDao.findAll();//error aqui
	}

	@Override
	public void delete(Integer id) {
		tipomanejoDao.deleteById(id);
		
	}

	@Override
	public List<Tipomanejo> findByVehiculoId(Integer id) {
		return (List<Tipomanejo>) tipomanejoDao.findById(id).orElse(null);
	}

}
