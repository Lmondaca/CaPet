package com.grupo3.cuidares.service;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.repository.RepositorioOfertaDueno;

@Service
public class ServicioOfertaDueno {
	private final RepositorioOfertaDueno repositorioOfertaDueno;

	public ServicioOfertaDueno(RepositorioOfertaDueno repositorioOfertaDueno) {
		
		this.repositorioOfertaDueno = repositorioOfertaDueno;
	}
	

}
