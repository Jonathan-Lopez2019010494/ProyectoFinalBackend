package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.ClienteContrato;
import client.dominio.ContratoDTO;
import client.util.ResponseDTO;

@Service
public class ContratoServicio {
	@Autowired
	ClienteContrato contratobd;
	
	public Map<String, Object>listar(){
		Map<String, Object>model=new HashMap<>();
		try {
			ResponseDTO contratolist=contratobd.listar();
			model.put("contratolist", contratolist.getRespuesta());
		}
		
		catch(Exception e){
			model.put("err", "error");
			model.put("msg", "error en extraccion de datos, si el problema persiste contactar al Administrador");
			e.printStackTrace();
		}
		   
		return model;
		   
	}
	
	   public Map<String, Object>crear(ContratoDTO contrato){
		   Map<String, Object>model=new HashMap<>();
		   
		   try {
			   
			   ResponseDTO res = contratobd.crear(contrato);
		   }catch(HttpStatusCodeException e) {
			   
			   model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			   e.printStackTrace();
		   }
		   return model;
	   }
	   
	   public Map<String, Object>actualizar(ContratoDTO contrato){
		   Map<String, Object>model = new HashMap<>();
		   
		   try {
			   ResponseDTO res = contratobd.actualizar(contrato);
			   
		   }catch(HttpStatusCodeException e) {
			   model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			   e.printStackTrace();
		   }
		   return model;
	   }
	   
	   public Map<String, Object>borrar(Long id){
		   Map<String, Object>model = new HashMap<>();
		   
		   try {
			   contratobd.borrar(id);
			   
		   }catch(HttpStatusCodeException e) {
			   model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			   e.printStackTrace();
		   }
		   return model;
	   }
}
