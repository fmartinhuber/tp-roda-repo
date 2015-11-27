package dto;

import java.io.Serializable;
import java.util.*;



public class BultoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int numeroBulto;
	private List <ItemBultoDto> itemBulto;
	private RemitoDto remito;
	private FacturaDto factura;
	
	public BultoDto(int numeroBulto, List<ItemBultoDto> itemBulto,
			RemitoDto remito, FacturaDto factura) {
		this.numeroBulto = numeroBulto;
		this.itemBulto = itemBulto;
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

	public List<ItemBultoDto> getItemBulto() {
		return itemBulto;
	}

	public void setItemBulto(List<ItemBultoDto> itemBulto) {
		this.itemBulto = itemBulto;
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
