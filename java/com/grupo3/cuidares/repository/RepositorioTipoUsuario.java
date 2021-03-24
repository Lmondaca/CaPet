package com.grupo3.cuidares.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.TiposUsuario;

@Repository
public interface RepositorioTipoUsuario extends CrudRepository<TiposUsuario, Long>{
	List<TiposUsuario> findAll();
	Optional<TiposUsuario> findByTipo(String tipo);

}
