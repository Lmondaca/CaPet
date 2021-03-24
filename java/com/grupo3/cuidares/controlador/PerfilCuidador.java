package com.grupo3.cuidares.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilCuidador {
    @RequestMapping("/cuidador")
    public String cuidador(){
        return "vistasPerfilCuidador/cuidador.jsp";
    }
    
}
