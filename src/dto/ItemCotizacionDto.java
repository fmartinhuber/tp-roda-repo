package dto;

import java.io.Serializable;



public class ItemCotizacionDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int nroRegistro;
	public int getNroRegistro() {
		return nroRegistro;
	}

	public void setNroRegistro(int nroRegistro) {
		this.nroRegistro = nroRegistro;
	}

	private RodamientoDto rodamiento;
	private int cant;
	private float precio;
	
	
	
	public ItemCotizacionDto(RodamientoDto rodamiento, int cant, float precio) {
		this.rodamiento = rodamiento;
		this.cant = cant;
		this.setPrecio(precio);
	}

	public ItemCotizacionDto(){
		
	}

	public RodamientoDto getRodamiento() {
		return rodamiento;
	}
	
	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public int getCant() {
		return cant;
	}
	
	public void setCant(int cantidad) {
		this.cant = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
