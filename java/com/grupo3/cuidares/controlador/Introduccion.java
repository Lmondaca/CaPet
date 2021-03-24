package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/introduccion")
public class Introduccion {
	@RequestMapping("")
	public String irIntro() {
		return "vistasFINAL/introduccion.jsp";
	}
	
}
