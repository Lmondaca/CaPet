package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Comuna;
import com.grupo3.cuidares.repository.RepositorioComuna;

@Service
public class ServicioComuna {
	private final RepositorioComuna repositorioCom;

	public ServicioComuna(RepositorioComuna repositorioCom) {
		this.repositorioCom = repositorioCom;
	}
	
	public Comuna crearComuna(Comuna c) {
		return repositorioCom.save(c);
	}
	

}
