package com.grupo3.cuidares.controlador;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.grupo3.cuidares.models.Usuario;
import com.grupo3.cuidares.service.ServicioUsuarioDueno;

@Controller
@RequestMapping("/login")
public class Login {
	
	private final ServicioUsuarioDueno servicio;
	
	public Login(ServicioUsuarioDueno servicio) {
		this.servicio = servicio;
	}
	@RequestMapping("")
	public String verLogin() {
		return "vistasFINAL/login.jsp";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String registroMascota(@RequestParam(value="email") String a,  @RequestParam(value="contra") String b, HttpSession sessions) {
		if(a.equals("") && b.equals("")) {
			return "redirect:/principal";
		}
		
		Usuario usuarioPorEmail = servicio.encontrarUsuarioEail(a);
		if(servicio.cormprobarContrasena(usuarioPorEmail, b)) {
			sessions.setAttribute("usuarioActual", usuarioPorEmail);
			return"vistasFINAL/login.jsp";
		}
		else {
			return "redirect:/principal";
		}
		
		
	}

}
