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

import client.dominio.ComidaDTO;
import client.servicio.ComidaServicio;


@Controller
@RequestMapping("/comida")
public class ComidaControlador {
	@Autowired
	ComidaServicio servicioComida;
	
	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo = new HashMap<>();
		modelo=(servicioComida.listar());
		vista.addAttribute("comidas", modelo.get("comidaList"));
		return "comida";
	}
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("crearComida", new ComidaDTO());
		return "CrearComida";
	}
	
	@PostMapping
	public String crear(@ModelAttribute ("crearComida")ComidaDTO comida) {
		servicioComida.crear(comida);
		return "redirect:/comida";
	}
	
	@GetMapping("/actualizar")
	public String redirectact(Model model) {
		model.addAttribute("actComida", new ComidaDTO());
		return "ActComida";		
	}
	
	
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actComida")ComidaDTO comida) {
		servicioComida.actualizar(comida);
		return "redirect:/comida";
	}
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) {
		servicioComida.borrar(id);
		return "redirect:/comida";
	}
	
}
