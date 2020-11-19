package client.dominio;

public class MonedaDTO {
	
	private Long idMoneda;
	private String divisa;
	private String abreviatura;
	private String simbolo;
	private String pais;
	
	public MonedaDTO() {
	
	}
	
	public MonedaDTO(Long idMoneda, String divisa, String abreviatura, String simbolo, String pais) {
		
		this.idMoneda=idMoneda;
		this.divisa=divisa;
		this.abreviatura=abreviatura;
		this.simbolo=simbolo;
		this.pais=pais;
		
	}
	
	// G_Y_S

	public Long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(Long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}