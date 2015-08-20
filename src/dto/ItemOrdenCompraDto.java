package dto;

import java.io.Serializable;



public class ItemOrdenCompraDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrdenPedidoDto ordenPedido;
	private float monto;
	public OrdenPedidoDto getOrdenPedido() {
		return ordenPedido;
	}
	public void setOrdenPedido(OrdenPedidoDto ordenPedido) {
		this.ordenPedido = ordenPedido;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
}
