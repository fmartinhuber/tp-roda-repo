package dto;

import java.io.Serializable;

/**
 * @author Martin
 *	Los rodamientos los sacas de los items de cotizacion. 
 */
public class ItemFacturaDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private RodamientoDto rodamiento;
	private float precio;
	private int cantidad;
	
	
	public ItemFacturaDto(RodamientoDto rodamiento, float precio) {
		this.rodamiento = rodamiento;
		this.precio = precio;
	}
	
	public ItemFacturaDto(){
		
	}
	
	public RodamientoDto getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
