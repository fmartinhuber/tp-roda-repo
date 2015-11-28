package dto;

import java.io.Serializable;
import java.util.*;



public class ProveedorDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int nroProveedor;
	private String nombre;
	private String CUIT;
	private List<RodamientoDto> Rodamientos;
	
	
	public ProveedorDto(int nroProv, String nombre, String CUIT, List<RodamientoDto> rodamientos) {
		super();
		this.nroProveedor = nroProv;
		this.nombre = nombre;
		this.CUIT = CUIT;
		Rodamientos = rodamientos;
	}

	public ProveedorDto(){
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<RodamientoDto> getRegulares() {
		return Rodamientos;
	}
	
	public void setRegulares(List<RodamientoDto> regulares) {
		Rodamientos = regulares;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String CUIT) {
		this.CUIT = CUIT;
	}

	public List<RodamientoDto> getRodamientos() {
		return Rodamientos;
	}

	public void setRodamientos(List<RodamientoDto> rodamientos) {
		Rodamientos = rodamientos;
	}
		
	public int getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(int nroProveedor) {
		this.nroProveedor = nroProveedor;
	}

}
