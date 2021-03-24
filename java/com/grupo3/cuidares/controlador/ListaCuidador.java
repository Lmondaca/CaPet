package com.grupo3.cuidares.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo3.cuidares.models.Usuario;

@Controller
@RequestMapping("/principal")
public class ListaCuidador {
	@RequestMapping("")
	public String irPrincipal(Model modelo, HttpSession sessions) {
		modelo.addAttribute("session", (Usuario) sessions.getAttribute("usuarioActual"));
		// TENGO LA SESSION DEL LOGIN EN PRINCIPAL, USAR LA SESSION PARA CAMBIAR LAS PAGINAS SEGUN EL TIPO DE USUARIO.
		return "vistasFINAL/listaDueños.jsp";
	}

}
