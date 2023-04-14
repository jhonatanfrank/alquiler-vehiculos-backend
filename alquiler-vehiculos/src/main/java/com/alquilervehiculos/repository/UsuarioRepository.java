package com.alquilervehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alquilervehiculos.model.Cliente;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Cliente, Integer>{
	
	Optional<Cliente> findOneByEmail(String email); //verificar estoooooooooo
	

}
