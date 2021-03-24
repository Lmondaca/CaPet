package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioMensaje;

@Service
public class ServicioMensaje {
	private final RepositorioMensaje repositorioMen;

	public ServicioMensaje(RepositorioMensaje repositorioMen) {
		
		this.repositorioMen = repositorioMen;
	}
	

}
