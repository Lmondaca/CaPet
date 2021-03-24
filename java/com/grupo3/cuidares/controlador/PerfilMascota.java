package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilMascota {
    @RequestMapping("/perfil")
    public String mascota(){
        return"vistasFINAL/perfilMascota.jsp";
    }
    
}
