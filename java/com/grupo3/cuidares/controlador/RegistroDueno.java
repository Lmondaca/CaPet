package com.grupo3.cuidares.controlador;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grupo3.cuidares.models.TiposUsuario;
import com.grupo3.cuidares.models.Usuario;
import com.grupo3.cuidares.service.ServicioCiudad;
import com.grupo3.cuidares.service.ServicioComuna;
import com.grupo3.cuidares.service.ServicioDireccion;
import com.grupo3.cuidares.service.ServicioRegion;
import com.grupo3.cuidares.service.ServicioTipoUsuario;
import com.grupo3.cuidares.service.ServicioUsuarioDueno;



@Controller
@RequestMapping("/registro")
public class RegistroDueno {
	
	private final ServicioUsuarioDueno servicio;
	private final ServicioTipoUsuario servicioTipo;
	private final ServicioDireccion servicioDire;
	private final ServicioComuna servicioCom;
	private final ServicioCiudad servicioCiu;
	private final ServicioRegion servicioReg;
	
	
	
	public RegistroDueno(ServicioUsuarioDueno servicio, ServicioTipoUsuario servicioTipo,
			ServicioDireccion servicioDire, ServicioComuna servicioCom, ServicioCiudad servicioCiu,
			ServicioRegion servicioReg) {
		this.servicio = servicio;
		this.servicioTipo = servicioTipo;
		this.servicioDire = servicioDire;
		this.servicioCom = servicioCom;
		this.servicioCiu = servicioCiu;
		this.servicioReg = servicioReg;
	}
	@RequestMapping("")
	public String verRegistro(@ModelAttribute("usuario") Usuario user, Model modelo) {
		modelo.addAttribute("dueno", user);
		return "/vistasFINAL/registroDueno.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String crearDueno(@Valid @ModelAttribute("dueno") Usuario dueno, BindingResult result) {
		
		
		if(result.hasErrors()) {
			return "/vistasFINAL/registroDueno.jsp";
		}
		else {
			TiposUsuario tipo = servicioTipo.encontrarNombreTipo("Dueño");
			dueno.setTipo(tipo);
			servicioReg.crearRegion(dueno.getDireccion().getComunaPertenece().getCiudadPertenece().getRegionPertenece());
			servicioCiu.crearCiudad(dueno.getDireccion().getComunaPertenece().getCiudadPertenece());
			servicioCom.crearComuna(dueno.getDireccion().getComunaPertenece());
			servicioDire.crearDireccion(dueno.getDireccion());
			
			
			
			servicio.crearUsuario(dueno);
			
			
			return "redirect:/login";
		}
	}
	@GetMapping("/4")
	@ResponseBody
	public Usuario verUsuarios() {
		Usuario user = servicio.encontrarUsuario(4L);
		
		return user;
		
	}
}
