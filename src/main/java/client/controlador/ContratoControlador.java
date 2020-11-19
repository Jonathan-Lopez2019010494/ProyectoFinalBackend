package client.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import client.dominio.ContratoDTO;
import client.servicio.ContratoServicio;

@Controller
@RequestMapping("/contrato")
public class ContratoControlador {
	@Autowired
	ContratoServicio servicioContrato;
	
	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo = new HashMap<>();
		modelo=(servicioContrato.listar());
		vista.addAttribute("Contratos", modelo.get("contratolist"));
		return "contrato";
	}

	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("crearContrato", new ContratoDTO());
		return "CrearContrato";
	}
	
	@PostMapping
	public String crear(@ModelAttribute ("crearContrato")ContratoDTO contrato) {
		servicioContrato.crear(contrato);
		return "redirect:/contrato";
		
	}
	
	@GetMapping("/actualizar")
	public String redirectact(Model model) {
		model.addAttribute("actContrato", new ContratoDTO());
		return "ActContrato";
	}
	
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actContrato")ContratoDTO contrato) {
		servicioContrato.actualizar(contrato);
		return "redirect:/contrato";
	}
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) {
		servicioContrato.borrar(id);
		return "redirect:/contrato";
	}
}
