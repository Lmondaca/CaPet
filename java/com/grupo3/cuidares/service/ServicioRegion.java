package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Region;
import com.grupo3.cuidares.repository.RepositorioRegion;

@Service
public class ServicioRegion {
	private final RepositorioRegion repositorioReg;

	public ServicioRegion(RepositorioRegion repositorioReg) {
		
		this.repositorioReg = repositorioReg;
	}
	
	public Region crearRegion(Region r) {
		return repositorioReg.save(r);
	}
	

}
