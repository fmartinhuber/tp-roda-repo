package dto;

import java.io.Serializable;


public class ItemOrdenPedidoDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ItemCotizacionDto item;

	public ItemCotizacionDto getItem() {
		return item;
	}

	public void setItem(ItemCotizacionDto item) {
		this.item = item;
	}
}
