package client.dominio;

public class ContratoDTO {

    private Long id_contrato;
    private String  fecha_inicio;
    private String fecha_finalizacion;
    private String nombre_empleado;
    private String apellido_empleado;
    private int dui;
    
    public ContratoDTO(){
    	
    }
    
    public ContratoDTO(Long id_contrato,String fecha_inicio,String fecha_finalizacion,String nombre_empleado,String apellido_empleado,int dui){
    	this.id_contrato=id_contrato;
    	this.fecha_inicio=fecha_inicio;
    	this.fecha_finalizacion=fecha_finalizacion;
    	this.nombre_empleado=nombre_empleado;
    	this.apellido_empleado=apellido_empleado;
    	this.dui=dui;
    }

	public Long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_finalizacion() {
		return fecha_finalizacion;
	}

	public void setFecha_finalizacion(String fecha_finalizacion) {
		this.fecha_finalizacion = fecha_finalizacion;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getApellido_empleado() {
		return apellido_empleado;
	}

	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}

	public int getDui() {
		return dui;
	}

	public void setDui(int dui) {
		this.dui = dui;
	}


    
}
