package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.clientemoneda;
import client.dominio.MonedaDTO;
import client.util.ResponseDTO;

@Service
public class MonedaServicio {
	
	// Metodo_Listar
	
	@Autowired
	
	clientemoneda clientebd;
	
	public Map<String, Object>listar(){
		
		Map<String, Object>model = new HashMap<>();
		
		try {
			
			ResponseDTO monedaList=clientebd.listar();
			
			model.put("monedaList", monedaList.getRespuesta());
			
		}catch(Exception e){
			
			model.put("err","error");
			
			model.put("msg","Error al extraer los datos, Si el problema persiste contacte al admin");
			
			e.printStackTrace();
			
		}
		
		return model;
		
	}
	
	// Metodo_Insertar
	
	public Map<String, Object>crear(MonedaDTO moneda){
		
			Map<String, Object>model = new HashMap<>();
		
		try {
			
			ResponseDTO res= clientebd.crear(moneda);
			
		}catch(HttpStatusCodeException e){
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			
			e.printStackTrace();
			
		}
		
		return model;
		
	}
	
	// Metodo_Actualizar
	
	public Map<String, Object>actualizar(MonedaDTO moneda){
		
		Map<String, Object>model = new HashMap<>();
		
		try {
			
			ResponseDTO res= clientebd.actualizar(moneda);
			
		}catch(HttpStatusCodeException e) {
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			
			e.printStackTrace();
			
		}
		
		return model;
		
	}
	
	// Metodo_Eliminar
	
	public Map<String, Object>borrar(Long id){
		
		Map<String, Object>model = new HashMap<>();
		
		try{
			
			clientebd.borrar(id);
			
		}catch(HttpStatusCodeException e){
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			
			e.printStackTrace();
			
		}
		
		return model;
		
	}
	
	
}