package dto;

import java.io.Serializable;
import java.util.List;



public class ODVDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private List <ClienteDto> clientes;
	private List <FacturaDto> facturas;
	private List <RemitoDto> remitos;
	private List <ProveedorDto> proveedores;
	private List <CotizacionDto> cotizaciones;
	private String centroIndustrial;
		
	
	
	public ODVDto(List<ClienteDto> clientes, List<FacturaDto> facturas,
			List<RemitoDto> remitos, List<ProveedorDto> proveedores,
			List<CotizacionDto> cotizaciones, String centroIndustrial) {
		super();
		this.clientes = clientes;
		this.facturas = facturas;
		this.remitos = remitos;
		this.proveedores = proveedores;
		this.cotizaciones = cotizaciones;
		this.centroIndustrial = centroIndustrial;
	}
	
	public ODVDto(){
		
	}

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
	
	public String getCentroIndustrial() {
		return centroIndustrial;
	}
	
	public void setCentroIndustrial(String centroIndustrial) {
		this.centroIndustrial = centroIndustrial;
	}
	

}
