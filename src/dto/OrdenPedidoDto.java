package dto;

import java.io.Serializable;
import java.util.List;



public class OrdenPedidoDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	private List <ItemOrdenPedidoDto> items;
	private ClienteDto cliente;
	private String estado;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<ItemOrdenPedidoDto> getItems() {
		return items;
	}
	public void setItems(List<ItemOrdenPedidoDto> items) {
		this.items = items;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
