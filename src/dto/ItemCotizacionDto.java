package dto;

import java.io.Serializable;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ItemCotizacion.java
//  @ Date : 13/05/2014
//  @ Author : 
//
//




public class ItemCotizacionDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RodamientoDto rodamiento;
	public RodamientoDto getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	private int cant;
}
