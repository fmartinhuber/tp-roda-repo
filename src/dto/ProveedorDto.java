package dto;

import java.io.Serializable;



public class ProveedorDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int nroProveedor;
	private String nombre;
	private String CUIT;
	
	
	
	public ProveedorDto(){
		
	}

	public ProveedorDto(int nroProveedor, String nombre, String cUIT) {
		super();
		this.nroProveedor = nroProveedor;
		this.nombre = nombre;
		CUIT = cUIT;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String CUIT) {
		this.CUIT = CUIT;
	}

	public int getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(int nroProveedor) {
		this.nroProveedor = nroProveedor;
	}

}
