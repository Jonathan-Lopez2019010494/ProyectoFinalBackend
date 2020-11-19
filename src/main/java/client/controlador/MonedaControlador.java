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

import client.dominio.MonedaDTO;
import client.servicio.MonedaServicio;

// Metodo_Listar

@Controller
@RequestMapping("/moneda")

public class MonedaControlador {

	@Autowired

	MonedaServicio servicioMoneda;

	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo = new HashMap<>();
		modelo = (servicioMoneda.listar());
		vista.addAttribute("monedas", modelo.get("monedaList"));
		return "moneda";
	}

	// Metodo_Crear

	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("crearMoneda", new MonedaDTO());
		return "CrearMoneda";
	}

	@PostMapping
	public String crear(@ModelAttribute("crearMoneda") MonedaDTO moneda) {
		servicioMoneda.crear(moneda);
		return "redirect:/moneda";
	}

	// Metodo_Actualizar
	
	@GetMapping("/actualizar")
	public String redirectact(Model model) {
		model.addAttribute("actMoneda", new MonedaDTO());
		return "ActMoneda";
	}
	
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actMoneda")MonedaDTO moneda) {
		servicioMoneda.actualizar(moneda);
		return "redirect:/moneda";
	}
	
	// Metodo_Borrar

	@PostMapping("/delete/{id}")

	public String borrar(@PathVariable("id") Long id) {
		servicioMoneda.borrar(id);
		return "redirect:/moneda";
	}

}