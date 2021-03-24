package com.grupo3.cuidares.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.cuidares.models.Region;

@Repository
public interface RepositorioRegion extends CrudRepository<Region, Long>{

}
