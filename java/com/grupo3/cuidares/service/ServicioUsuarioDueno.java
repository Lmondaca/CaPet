package com.grupo3.cuidares.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grupo3.cuidares.models.Usuario;
import com.grupo3.cuidares.repository.RepositorioDueno;

@Service
public class ServicioUsuarioDueno {
	private final RepositorioDueno repositorioDueno;

	public ServicioUsuarioDueno(RepositorioDueno repositorioCuidar) {
		
		this.repositorioDueno = repositorioCuidar;
	}
	
	public Usuario crearUsuario(Usuario u) {
		return repositorioDueno.save(u);
	}
	public Usuario encontrarUsuarioEail(String email) {
		List<Usuario> usuarioEncontrado = repositorioDueno.findByEmail(email);
		
		return usuarioEncontrado.get(0);
	}
	public List<Usuario> encontrarUsuariosPorTipo(String dueno) {
		return repositorioDueno.findByTipo(dueno);
	}
	
	public boolean cormprobarContrasena(Usuario usuario, String contrasena) {
		return contrasena.equals(usuario.getPassword());
	}
	
	public Usuario encontrarUsuario(Long id) {
		
		return repositorioDueno.findById(id).get();
	}
	
	
	

	
}
