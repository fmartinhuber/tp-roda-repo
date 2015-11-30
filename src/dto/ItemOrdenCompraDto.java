package dto;

import java.io.Serializable;



public class ItemOrdenCompraDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int nroItemOrdenCompra;
	private RodamientoDto rodamiento;
	private float monto;
	private int cantidad;

	
	
	public ItemOrdenCompraDto(int nroItemOrdenCompra, RodamientoDto rodamiento, float monto, int cantidad) {
		super();
		this.nroItemOrdenCompra = nroItemOrdenCompra;
		this.rodamiento = rodamiento;
		this.monto = monto;
		this.cantidad = cantidad;
	}

	public ItemOrdenCompraDto() {

	}

	public RodamientoDto getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getNroItemOrdenCompra() {
		return nroItemOrdenCompra;
	}

	public void setNroItemOrdenCompra(int nroItemOrdenCompra) {
		this.nroItemOrdenCompra = nroItemOrdenCompra;
	}
	
	
}
