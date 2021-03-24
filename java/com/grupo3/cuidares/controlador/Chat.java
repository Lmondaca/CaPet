package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/chat")
public class Chat {
	@RequestMapping("")
	public String verChat() {
		return "/vistasFINAL/chat.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String irPagina(@RequestParam(value="pagina") Integer pagina) {
		return "redirect:/inicio";
	}

	

}
