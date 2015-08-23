package dto;

import java.io.Serializable;

public class ItemFacturaDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private CotizacionDto orden;  
	private float subtotal;
	
	
	
	public ItemFacturaDto(CotizacionDto orden, float subtotal) {
		super();
		this.orden = orden;
		this.subtotal = subtotal;
	}
	
	public ItemFacturaDto(){
		
	}
	
	public CotizacionDto getOrden() {
		return orden;
	}
	public void setOrden(CotizacionDto orden) {
		this.orden = orden;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
