package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioCuidador;

@Service
public class ServicioUsuarioCuidador {
	private final RepositorioCuidador repositorioCuidador;

	public ServicioUsuarioCuidador(RepositorioCuidador repositorioCuidador) {
		this.repositorioCuidador = repositorioCuidador;
	}
	
	
	
	

}
