package dto;

import java.io.Serializable;
import java.util.List;


public class OrdenCompraDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numero;
	private String formaPago;
	private float total;	
	private float descuento;
	private List <ItemOrdenCompraDto> items;
	
	
	
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public List<ItemOrdenCompraDto> getItems() {
		return items;
	}
	public void setItems(List<ItemOrdenCompraDto> items) {
		this.items = items;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
