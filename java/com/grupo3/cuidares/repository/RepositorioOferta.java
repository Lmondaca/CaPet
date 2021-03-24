package com.grupo3.cuidares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.Oferta;

@Repository
public interface RepositorioOferta extends CrudRepository<Oferta, Long>{

}
