package dto;

import java.io.Serializable;



public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String razonSocial;
	private String mail;
	private int CUIT;
	private int unidades;
	private int meses;
	private int operaciones;
	
	
	
	public ClienteDto(String razonSocial, String mail, int cUIT, int unidades,
			int meses, int operaciones) {
		super();
		this.razonSocial = razonSocial;
		this.mail = mail;
		CUIT = cUIT;
		this.unidades = unidades;
		this.meses = meses;
		this.operaciones = operaciones;
	}
	
	public ClienteDto(){
		
	}
	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	public int getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(int operaciones) {
		this.operaciones = operaciones;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getCUIT() {
		return CUIT;
	}
	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}
	
	
}
