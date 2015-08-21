package dto;

import java.io.Serializable;





public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String razonSocial;
	private String mail;
	private int CUIT;
	private int idCliente;
	private int unidades;
	private int meses;
	private int operaciones;
	
	
	
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
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
		
}