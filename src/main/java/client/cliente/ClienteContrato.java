package client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.ContratoDTO;
import client.util.ResponseDTO;

@FeignClient(url="http://192.168.0.50:8090", name="contrato")
public interface ClienteContrato {
	@GetMapping(path="/contrato", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/contrato", produces="application/json")
	ResponseDTO crear(@RequestBody ContratoDTO comida);
	
	@PutMapping(path="/contrato", produces="application/json")
	ResponseDTO actualizar(@RequestBody ContratoDTO comida);
	
	@DeleteMapping(path="/contrato/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
}
