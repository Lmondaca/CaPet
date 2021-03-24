package com.grupo3.cuidares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.OfertaDueno;

@Repository
public interface RepositorioOfertaDueno extends CrudRepository<OfertaDueno, Long>{

}
