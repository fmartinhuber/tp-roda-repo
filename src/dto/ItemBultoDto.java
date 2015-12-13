package dto;

import java.io.Serializable;

public class ItemBultoDto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int numeroItemBulto;
	private RodamientoDto rodamiento;
	private int cantidad;
	
	public ItemBultoDto(int numeroItemBulto, RodamientoDto rodamiento,
			int cantidad) {
		this.numeroItemBulto = numeroItemBulto;
		this.rodamiento = rodamiento;
		this.cantidad = cantidad;
	}
	
	public ItemBultoDto() {
		
	}

	public int getNumeroItemBulto() {
		return numeroItemBulto;
	}

	public void setNumeroItemBulto(int numeroItemBulto) {
		this.numeroItemBulto = numeroItemBulto;
	}

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
