package dto;

import java.io.Serializable;

public class ItemFacturaDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrdenPedidoDto orden;  
	private float subtotal;
	public OrdenPedidoDto getOrden() {
		return orden;
	}
	public void setOrden(OrdenPedidoDto orden) {
		this.orden = orden;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
}
