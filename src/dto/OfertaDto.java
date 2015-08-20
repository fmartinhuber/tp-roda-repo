package dto;

import java.io.Serializable;


public class OfertaDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero; 
	private RodamientoDto Rodamiento;
	private float descuento;
	private int volumen;
	private int stock;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
