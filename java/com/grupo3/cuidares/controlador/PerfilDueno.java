package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo3.cuidares.models.Mascota;
import com.grupo3.cuidares.models.Usuario;

@Controller
public class PerfilDueno {

	@RequestMapping("/perfilDueno")
	public String humano(Model modelo) {
		Usuario user = new Usuario();
		user.setNombre("Matias");
		Mascota mascota= new Mascota();
		mascota.setNombre("pp");
		user.setMascotas(mascota);
		modelo.addAttribute("user", user);
		return "vistasFINAL/perfilDueno.jsp";
	}
}
