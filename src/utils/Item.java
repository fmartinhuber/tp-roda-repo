package utils;

import dto.*;

public class Item {
	private RodamientoDto rodamiento;
	private int cantidad;
	
	
	public Item(RodamientoDto rodamiento, int cantidad) {
		super();
		this.rodamiento = rodamiento;
		this.cantidad = cantidad;
	}
	
	public Item(){};


	public RodamientoDto getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
}
