package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioTipoMascota;

@Service
public class ServicioTipoMascota {
	private final RepositorioTipoMascota repositorioTipoMascota;

	public ServicioTipoMascota(RepositorioTipoMascota repositorioTipoMascota) {
	
		this.repositorioTipoMascota = repositorioTipoMascota;
	}
	
	

}
