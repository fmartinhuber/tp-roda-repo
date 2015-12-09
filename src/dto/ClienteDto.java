package dto;

import java.io.Serializable;



public class ClienteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numeroCliente;
	private String razonSocial;
	private String mail;
	private String CUIT;
	private String ov;
	private String password;
	
	public ClienteDto(int numeroCliente, String razonSocial, String mail,
			String CUIT) {
		super();
		this.numeroCliente = numeroCliente;
		this.razonSocial = razonSocial;
		this.mail = mail;
		this.CUIT = CUIT;
	}

	public ClienteDto(){
		
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
	
	public String getCUIT() {
		return CUIT;
	}
	
	public void setCUIT(String CUIT) {
		this.CUIT = CUIT;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getOv() {
		return ov;
	}

	public void setOv(String ov) {
		this.ov = ov;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
