package dto;

import java.io.Serializable;
import java.util.List;



public class ODVDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List <ClienteDto> clientes;
	private List <FacturaDto> facturas;
	private List <RemitoDto> remitos;
	private List <ProveedorDto> proveedores;
	private List <CotizacionDto> cotizaciones;
	private List <OrdenPedidoDto> ordenesC;
	public List<ClienteDto> getClientes() {
		return clientes;
	}
	public void setClientes(List<ClienteDto> clientes) {
		this.clientes = clientes;
	}
	public List<FacturaDto> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<FacturaDto> facturas) {
		this.facturas = facturas;
	}
	public List<RemitoDto> getRemitos() {
		return remitos;
	}
	public void setRemitos(List<RemitoDto> remitos) {
		this.remitos = remitos;
	}
	public List<ProveedorDto> getProveedores() {
		return proveedores;
	}
	public void setProveedores(List<ProveedorDto> proveedores) {
		this.proveedores = proveedores;
	}
	public List<CotizacionDto> getCotizaciones() {
		return cotizaciones;
	}
	public void setCotizaciones(List<CotizacionDto> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}
	public List<OrdenPedidoDto> getOrdenesC() {
		return ordenesC;
	}
	public void setOrdenesC(List<OrdenPedidoDto> ordenesC) {
		this.ordenesC = ordenesC;
	}
	public String getCentroIndustrial() {
		return centroIndustrial;
	}
	public void setCentroIndustrial(String centroIndustrial) {
		this.centroIndustrial = centroIndustrial;
	}
	private String centroIndustrial;
}