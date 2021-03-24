package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioCuidadoEspecial;

@Service
public class ServicioCuidadoEspecial {
	private final RepositorioCuidadoEspecial repositorioCuiEsp;

	public ServicioCuidadoEspecial(RepositorioCuidadoEspecial repositorioCuiEsp) {
		
		this.repositorioCuiEsp = repositorioCuiEsp;
	}
	

}
