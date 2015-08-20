package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class CCDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List <OrdenCompraDto> ordenesP;
	private List <RodamientoDto> rodamientos;
	private List <RodamientoDto> listaComparativa ;
	
	public CCDto()
	{
		ordenesP=new ArrayList<OrdenCompraDto>();
		rodamientos=new ArrayList <RodamientoDto>();
		
	}
	public List<OrdenCompraDto> getOrdenesP() {
		return ordenesP;
	}
	public void setOrdenesP(List<OrdenCompraDto> ordenesP) {
		this.ordenesP = ordenesP;
	}
	public List<RodamientoDto> getRodamientos() {
		return rodamientos;
	}
	public void setRodamientos(List<RodamientoDto> rodamientos) {
		this.rodamientos = rodamientos;
	}
	public List <RodamientoDto> getListaComparativa() {
		return listaComparativa;
	}
	public void setListaComparativa(List <RodamientoDto> listaComparativa) {
		this.listaComparativa = listaComparativa;
	}
}
