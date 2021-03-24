package com.grupo3.cuidares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.TipoMascota;

@Repository
public interface RepositorioTipoMascota extends CrudRepository<TipoMascota, Long> {

}
