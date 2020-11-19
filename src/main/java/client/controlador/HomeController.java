package client.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
    @RequestMapping("/index")
    public String welcome() {
        return "index";
    }
	
    @RequestMapping("/comida")
    public String cargarComida() {
        return "comida";
    }
    
    @RequestMapping("/moneda")
    public String cargarMoneda() {
        return "moneda";
    }
    
    @RequestMapping("/contrato")
    public String cargarContrato() {
        return "contrato";
    }
}
