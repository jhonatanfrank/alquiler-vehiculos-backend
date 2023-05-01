package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alquilervehiculos.dao.ContactoDao;
import com.alquilervehiculos.model.Contacto;

@Service
public class ContactoServiceImpl implements ContactoService{

	@Autowired
	private ContactoDao contactoDao;
	
	@Override
	@Transactional(readOnly = false)

	public Contacto save(Contacto contacto) {
		// TODO Auto-generated method stub
		return contactoDao.save(contacto);
	}

	@Override
	@Transactional(readOnly = false)

	public void delete(Integer id) {
		contactoDao.deleteById(id);		
	}

	@Override
	@Transactional(readOnly = false)

	public Contacto findById(Integer id) {
		return contactoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public List<Contacto> findAll() {
		return (List<Contacto>) contactoDao.findAll();
	}

}
