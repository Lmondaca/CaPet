package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Ciudad;
import com.grupo3.cuidares.repository.RepositorioCiudad;

@Service
public class ServicioCiudad {
	private final RepositorioCiudad repositorioCiu;

	public ServicioCiudad(RepositorioCiudad repositorioCiu) {
		this.repositorioCiu = repositorioCiu;
	}
	public Ciudad crearCiudad(Ciudad c) {
		return repositorioCiu.save(c);
	}
	

}
