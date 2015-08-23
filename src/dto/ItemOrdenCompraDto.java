package dto;

import java.io.Serializable;



public class ItemOrdenCompraDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private CotizacionDto ordenPedido;
	private float monto;
	
	public ItemOrdenCompraDto(CotizacionDto ordenPedido, float monto) {
		super();
		this.ordenPedido = ordenPedido;
		this.monto = monto;
	}
	
	public ItemOrdenCompraDto(){
		
	}

	public CotizacionDto getOrdenPedido() {
		return ordenPedido;
	}

	public void setOrdenPedido(CotizacionDto ordenPedido) {
		this.ordenPedido = ordenPedido;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	
}
