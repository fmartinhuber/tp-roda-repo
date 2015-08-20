package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class RemitoDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	private String estado;
	private ClienteDto cliente;
	private List <OrdenPedidoDto> ordenes;
	private String comentarios;
	private Date fecha;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public List<OrdenPedidoDto> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<OrdenPedidoDto> ordenes) {
		this.ordenes = ordenes;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isConformidad() {
		return conformidad;
	}
	public void setConformidad(boolean conformidad) {
		this.conformidad = conformidad;
	}
	private boolean conformidad;
}
