package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioSala;

@Service
public class ServicioSala {
	private final RepositorioSala repositorioSala;

	public ServicioSala(RepositorioSala repositorioSala) {
		this.repositorioSala = repositorioSala;
	}
	

}
