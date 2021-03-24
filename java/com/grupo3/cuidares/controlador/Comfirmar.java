package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Comfirmar {
	@RequestMapping("/confirmar")
	public String irRegistro() {
		return"vistasComfirmaCuidadorRegistro/comfirmaCuidador.jsp";
	}
	@RequestMapping(value= "/confirmar", method=RequestMethod.POST)
	public String enviarARegistro() {
		return "redirect:/registroCuidador";
	}

}
