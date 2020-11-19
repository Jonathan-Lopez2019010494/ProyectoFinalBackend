package client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.MonedaDTO;
import client.util.ResponseDTO;

@FeignClient(url="http://192.168.0.50:8090", name="moneda")

public interface clientemoneda {
	
	@GetMapping(path="/moneda", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/moneda", produces="application/json")
	ResponseDTO crear(@RequestBody MonedaDTO Moneda);
	
	@PutMapping(path="/moneda", produces="application/json")
	ResponseDTO actualizar(@RequestBody MonedaDTO Moneda);
	
	@DeleteMapping(path="/moneda/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
	
}