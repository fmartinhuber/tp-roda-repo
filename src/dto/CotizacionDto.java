package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class CotizacionDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<ItemCotizacionDto> items;
	private int idCotizacion;
	private String estado;
	
	private ClienteDto cliente;
	private Date fecha;
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public CotizacionDto()
	{
		items=new ArrayList <ItemCotizacionDto>();
	}
	
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public List<ItemCotizacionDto> getItems() {
		return items;
	}
	public void setItems(List<ItemCotizacionDto> items) {
		this.items = items;
	}
	public int getIdCotizacion() {
		return idCotizacion;
	}
	public void setIdCotizacion(int idCotizacion) {
		this.idCotizacion = idCotizacion;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
