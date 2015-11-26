package dto;

import java.io.Serializable;
import java.util.*;

import utils.ItemDto;



public class BultoDto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int numeroBulto;
	private List <ItemDto> itemRodamiento;
	private RemitoDto remito;
	private FacturaDto factura;
	
	public BultoDto(int numeroBulto, List<ItemDto> itemRodamiento, RemitoDto remito, FacturaDto factura) {
		this.numeroBulto = numeroBulto;
		this.itemRodamiento = itemRodamiento;
		this.remito = remito;
		this.factura = factura;
	}
	
	public BultoDto() {
		
	}

	public int getNumeroBulto() {
		return numeroBulto;
	}

	public void setNumeroBulto(int numeroBulto) {
		this.numeroBulto = numeroBulto;
	}

	public List<ItemDto> getItemRodamiento() {
		return itemRodamiento;
	}

	public void setItemRodamiento(List<ItemDto> itemRodamiento) {
		this.itemRodamiento = itemRodamiento;
	}

	public RemitoDto getRemito() {
		return remito;
	}

	public void setRemito(RemitoDto remito) {
		this.remito = remito;
	}

	public FacturaDto getFactura() {
		return factura;
	}

	public void setFactura(FacturaDto factura) {
		this.factura = factura;
	}
	
}
