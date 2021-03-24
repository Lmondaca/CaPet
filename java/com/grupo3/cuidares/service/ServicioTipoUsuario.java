package com.grupo3.cuidares.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.TiposUsuario;
import com.grupo3.cuidares.repository.RepositorioTipoUsuario;

@Service
public class ServicioTipoUsuario {
	private final RepositorioTipoUsuario repositorioTipoUsuario;

	public ServicioTipoUsuario(RepositorioTipoUsuario repositorioTipoUsuario) {

		this.repositorioTipoUsuario = repositorioTipoUsuario;
	}
	public TiposUsuario encontrarTipo(Long id) {
		Optional<TiposUsuario> optionalTipo = repositorioTipoUsuario.findById(id);
		if(optionalTipo.isPresent()) {
			return optionalTipo.get();
		}
		else {
			return null;
		}
		
	}
	public TiposUsuario encontrarNombreTipo(String duenoTipo) {
		Optional<TiposUsuario> optionalTipo = repositorioTipoUsuario.findByTipo(duenoTipo);
		if(optionalTipo.isPresent()) {
			return optionalTipo.get();
		}
		else {
			return repositorioTipoUsuario.save(new TiposUsuario(duenoTipo));
		}
	}
	

	public TiposUsuario crearTipoUsuario( TiposUsuario t) {

		return repositorioTipoUsuario.save(t);
	}
	public void updateTipo(TiposUsuario t) {
		repositorioTipoUsuario.save(t);
	}
	
	


}
