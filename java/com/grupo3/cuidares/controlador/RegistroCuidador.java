package com.grupo3.cuidares.controlador;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grupo3.cuidares.models.Ciudad;
import com.grupo3.cuidares.models.Comuna;
import com.grupo3.cuidares.models.Direccion;
import com.grupo3.cuidares.models.Region;
import com.grupo3.cuidares.models.TiposUsuario;
import com.grupo3.cuidares.models.Usuario;
import com.grupo3.cuidares.service.ServicioCiudad;
import com.grupo3.cuidares.service.ServicioComuna;
import com.grupo3.cuidares.service.ServicioDireccion;
import com.grupo3.cuidares.service.ServicioRegion;
import com.grupo3.cuidares.service.ServicioTipoUsuario;
import com.grupo3.cuidares.service.ServicioUsuarioDueno;

@Controller
@RequestMapping("/registro-cuidador")
public class RegistroCuidador {
	private final ServicioUsuarioDueno servicio;
	private final ServicioTipoUsuario servicioTipo;
	private final ServicioDireccion servicioDire;
	private final ServicioComuna servicioCom;
	private final ServicioCiudad servicioCiu;
	private final ServicioRegion servicioReg;
	
	
	
	public RegistroCuidador(ServicioUsuarioDueno servicio, ServicioTipoUsuario servicioTipo,
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
	public String verRegistro(@ModelAttribute("cuidador") Usuario user, Model model) {
		model.addAttribute("cuidador", user);
		
		return "/vistasFINAL/registroCuidador.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String enviarRegistro(@Valid @ModelAttribute("usuario") Usuario cuidador, BindingResult result) {
		if(result.hasErrors()) {
			return "/vistasFINAL/registroCuidador.jsp";
		}
		else {
			TiposUsuario tipo= servicioTipo.encontrarNombreTipo("Cuidador");
			cuidador.setTipo(tipo);
			servicioReg.crearRegion(cuidador.getDireccion().getComunaPertenece().getCiudadPertenece().getRegionPertenece());
			servicioCiu.crearCiudad(cuidador.getDireccion().getComunaPertenece().getCiudadPertenece());
			servicioCom.crearComuna(cuidador.getDireccion().getComunaPertenece());
			servicioDire.crearDireccion(cuidador.getDireccion());
			servicio.crearUsuario(cuidador);
			
			return "redirect:/login";
		}
	}
	@PostMapping("/4")
	@ResponseBody
	public Usuario registrarUsuario(@RequestParam("nombreUse")String nombreUser, @RequestParam("apellido") String ape, @RequestParam("email") String email, @RequestParam("contra") String contra, @RequestParam("nacimiento") String fechaNac, @RequestParam("desc") String desc, @RequestParam("calle") String calle, @RequestParam("numero_casa") Integer numCasa, @RequestParam("comuna") String nombreCom, @RequestParam("ciudad") String nomCiud, @RequestParam("region") String nomRegion, @RequestParam("tipoUsua") String tipoUsuario ) {
		Usuario user = new Usuario();
		user.setNombre(nombreUser);
		user.setApellido(ape);
		user.setEmail(email);
		user.setPassword(contra);
		//user.setFechaNacimiento(fechaNac);
		user.setDescripcion(desc);
		Direccion dir = new Direccion();
		dir.setNombreCalle(calle);
		dir.setNumeroCasa(numCasa);
		
		Comuna com = new Comuna();
		com.setNombre(nombreCom);
		
		Ciudad ciu = new Ciudad();
		ciu.setNombre(nomCiud);
		
		Region reg = new Region();
		reg.setNombre(nomRegion);
		
		ciu.setRegionPertenece(reg);
		com.setCiudadPertenece(ciu);
		dir.setComunaPertenece(com);
		
		user.setDireccion(dir);
		
		TiposUsuario tipoU = new TiposUsuario();
		tipoU.setTipo(tipoUsuario);
		user.setTipo(tipoU);
		
		
		return user;
	}

}
