package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pago")
public class Pago {
	@RequestMapping("")
	public String irPagar() {
		return "/vistasFINAL/pago.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String comfirmarPago(@RequestParam(value="pago") Integer monto) {
		return "redirect:/chat";
	}
}
