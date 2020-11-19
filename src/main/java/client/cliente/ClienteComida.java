package client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.ComidaDTO;
import client.util.ResponseDTO;

@FeignClient(url="http://192.168.0.50:8090", name="comida")
public interface ClienteComida {
	@GetMapping(path="/comida", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/comida", produces="application/json")
	ResponseDTO crear(@RequestBody ComidaDTO comida);
	
	@PutMapping(path="/comida", produces="application/json")
	ResponseDTO actualizar(@RequestBody ComidaDTO comida);
	
	@DeleteMapping(path="/comida/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
}
