package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioOferta;

@Service
public class ServicioOferta {
	private final RepositorioOferta repositorioOfer;

	public ServicioOferta(RepositorioOferta repositorioOfer) {
	
		this.repositorioOfer = repositorioOfer;
	}
	

}
