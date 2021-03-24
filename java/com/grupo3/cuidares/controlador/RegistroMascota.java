package com.grupo3.cuidares.controlador;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grupo3.cuidares.models.Mascota;
import com.grupo3.cuidares.models.Usuario;
import com.grupo3.cuidares.service.ServicioMascota;
import com.grupo3.cuidares.service.ServicioTipoMascota;

@Controller
@RequestMapping("/registroMascota")
public class RegistroMascota {
	
	private final ServicioMascota servicioMascota;
	private final ServicioTipoMascota servicioTipoMascota;
	
	
	public RegistroMascota(ServicioMascota servicioMascota, ServicioTipoMascota servicioTipoMascota) {
		
		this.servicioMascota = servicioMascota;
		this.servicioTipoMascota = servicioTipoMascota;
	}

	@RequestMapping("")
	public String registrarMascota(@ModelAttribute("mascota") Mascota masc, Model model) {
		model.addAttribute("mascota", masc);
		return "/vistasFINAL/registroMascota.jsp";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String registroMascota(@Valid @ModelAttribute("mascota") Mascota mascota, BindingResult result ) {
		if(result.hasErrors()) {
			return "/vistasFINAL/registroMascota.jsp";
		}
		else {
			
			
			servicioMascota.crearMascota(mascota);
			
			
			return "redirect:/perfil"; //al perfil del usuario actual
		}
		
		
		
	}
	

}
