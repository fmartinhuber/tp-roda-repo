package dto;

import java.io.Serializable;
import java.util.List;


public class ProveedorDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero; 
	private String nombre;
	private List<RodamientoDto> Rodamientos;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
}
