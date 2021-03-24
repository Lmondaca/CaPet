package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Direccion;
import com.grupo3.cuidares.repository.RepositorioDireccion;

@Service
public class ServicioDireccion {
	private final RepositorioDireccion repositorioDir;

	public ServicioDireccion(RepositorioDireccion repositorioDir) {
		
		this.repositorioDir = repositorioDir;
	}
	public Direccion crearDireccion(Direccion d) {
		return repositorioDir.save(d);
	}
	

}
