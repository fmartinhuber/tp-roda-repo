package dto;

import java.io.Serializable;
import java.util.*;

import utils.ItemDto;



public class BultoDto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int numeroBulto;
	private List <ItemDto> rodamientos;
	private RemitoDto remito;
	private FacturaDto factura;
	
	public BultoDto(int numeroBulto, List<ItemDto> rodamientos, RemitoDto remito, FacturaDto factura) {
		this.numeroBulto = numeroBulto;
		this.rodamientos = rodamientos;
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

	public List<ItemDto> getRodamientos() {
		return rodamientos;
	}

	public void setRodamientos(List<ItemDto> rodamientos) {
		this.rodamientos = rodamientos;
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
