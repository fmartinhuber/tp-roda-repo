package dto;

import java.io.Serializable;
import java.util.*;


public class OrdenCompraDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String formaPago;
	private float total;	
	private float descuento;
	private List <ItemOrdenCompraDto> items;
		
	
	
	public OrdenCompraDto(String formaPago, float total,
			float descuento, List<ItemOrdenCompraDto> items) {
		super();
		this.formaPago = formaPago;
		this.total = total;
		this.descuento = descuento;
		this.items = items;
	}
	
	public OrdenCompraDto(){
		
	}

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
	
	
}
