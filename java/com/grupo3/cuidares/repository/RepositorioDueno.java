package com.grupo3.cuidares.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.Usuario;



@Repository
public interface RepositorioDueno extends CrudRepository<Usuario, Long> {
	List<Usuario> findByEmail(String email);
	List<Usuario> findByTipo(String tipo);
}
