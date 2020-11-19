package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.stereotype.Service;

import client.cliente.ClienteComida;
import client.dominio.ComidaDTO;
import client.util.ResponseDTO;

@Service
public class ComidaServicio {
	
	@Autowired
	ClienteComida clientebd;
	
	public Map<String, Object>listar(){
		Map<String, Object>model= new HashMap<>();
		try {
			ResponseDTO comidaList=clientebd.listar();
			model.put("comidaList", comidaList.getRespuesta());
		}
		catch(Exception e) {
			model.put("arr", "error");
			model.put("msg", "Error al extraer datos");
			e.printStackTrace();
		}
		
		return model;
	}
	
	public Map<String, Object>crear(ComidaDTO comida){
		Map<String, Object>model= new HashMap<>();
		try {
			ResponseDTO res =clientebd.crear(comida);
		}
		catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return model;
	}
	
	public Map<String, Object>actualizar(ComidaDTO comida){
		Map<String, Object>model= new HashMap<>();
		try {
			ResponseDTO res =clientebd.actualizar(comida);
		}
		catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return model;
	}
	
	public Map<String, Object>borrar(Long id){
		Map<String, Object>model= new HashMap<>();
		try {
			clientebd.borrar(id);
		}
		catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return model;
	}
}
