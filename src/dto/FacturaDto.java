package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;




public class FacturaDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	private String estado;
	private Date fecha;
	private ClienteDto cliente;
	private OrdenPedidoDto pedido; 
	private float descuento; 
	private List <ItemFacturaDto> items; 
	private float total;
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public List<ItemFacturaDto> getItems() {
		return items;
	}
	public void setItems(List<ItemFacturaDto> items) {
		this.items = items;
	}
	public OrdenPedidoDto getPedido() {
		return pedido;
	}
	public void setPedido(OrdenPedidoDto pedido) {
		this.pedido = pedido;
	}
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
}