package dto;

import java.io.Serializable;


public class OfertaDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private RodamientoDto Rodamiento;
	private float descuento;
	private int volumen;
	private int stock;
	
		
	
	public OfertaDto(RodamientoDto rodamiento, float descuento,
			int volumen, int stock) {
		super();
		Rodamiento = rodamiento;
		this.descuento = descuento;
		this.volumen = volumen;
		this.stock = stock;
	}
	
	public OfertaDto(){
		
	}

	public RodamientoDto getRodamiento() {
		return Rodamiento;
	}
	
	public void setRodamiento(RodamientoDto rodamiento) {
		Rodamiento = rodamiento;
	}
	
	public float getDescuento() {
		return descuento;
	}
	
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
