package com.grupo3.cuidares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.Sala;

@Repository
public interface RepositorioSala extends CrudRepository<Sala, Long>{

}
