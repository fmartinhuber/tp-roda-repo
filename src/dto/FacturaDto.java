package dto;

import java.io.Serializable;
import java.util.*;


public class FacturaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int numeroFactura;
	private String estado;
	private Date fecha;
	private ClienteDto cliente;
	private float descuento;
	private List <ItemFacturaDto> items;
	private float total;
	
	//Lo agregue para que se sepa que cotizacion se esta facturando.
	private List<CotizacionDto> cotizacion;

	public FacturaDto(String estado, Date fecha, ClienteDto cliente, float descuento, List<ItemFacturaDto> items,
			float total, List<CotizacionDto> cotizacion) {
		this.estado = estado;
		this.fecha = fecha;
		this.cliente = cliente;
		this.descuento = descuento;
		this.items = items;
		this.total = total;
		this.cotizacion = cotizacion;
	}

	public FacturaDto() {
		
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public List<ItemFacturaDto> getItems() {
		return items;
	}

	public void setItems(List<ItemFacturaDto> items) {
		this.items = items;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<CotizacionDto> getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(List<CotizacionDto> cotizacion) {
		this.cotizacion = cotizacion;
	}
		
}
