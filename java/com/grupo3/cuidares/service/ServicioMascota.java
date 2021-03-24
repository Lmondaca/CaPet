package com.grupo3.cuidares.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Mascota;
import com.grupo3.cuidares.repository.RepositorioMascota;

@Service
public class ServicioMascota {
	private final RepositorioMascota repositorioMascota;

	public ServicioMascota(RepositorioMascota repositorioMascota) {
		
		this.repositorioMascota = repositorioMascota;
	}

	public void crearMascota(@Valid Mascota mascota) {
		// TODO Auto-generated method stub
		repositorioMascota.save(mascota);
		
	}
	
	

}
