package client.dominio;

public class ComidaDTO {
	private Long idComida;
	private String descomida;
	private String fechalot;
	private String fec_v;
	private String marca_com;
	private String can;
	
	public ComidaDTO() {
		
	}
	
	public ComidaDTO(Long idComida, String descomida, String fechalot, String fec_v, String marca_com, String can) {
		this.idComida=idComida;
		this.descomida=descomida;
		this.fechalot=fechalot;
		this.fec_v=fec_v;
		this.marca_com=marca_com;
		this.can=can;
	}

	public Long getIdComida() {
		return idComida;
	}

	public void setIdComida(Long idComida) {
		this.idComida = idComida;
	}

	public String getDescomida() {
		return descomida;
	}

	public void setDescomida(String descomida) {
		this.descomida = descomida;
	}

	public String getFechalot() {
		return fechalot;
	}

	public void setFechalot(String fechalot) {
		this.fechalot = fechalot;
	}

	public String getFec_v() {
		return fec_v;
	}

	public void setFec_v(String fec_v) {
		this.fec_v = fec_v;
	}

	public String getMarca_com() {
		return marca_com;
	}

	public void setMarca_com(String marca_com) {
		this.marca_com = marca_com;
	}

	public String getCan() {
		return can;
	}

	public void setCan(String can) {
		this.can = can;
	}
	
	
}
