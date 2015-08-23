package dto;

import java.io.Serializable;
import java.util.*;



public class CCDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List <OrdenCompraDto> ordenesP;
	private List <RodamientoDto> rodamientos;
	private List <RodamientoDto> listaComparativa ;
	
	
	
	public CCDto(List<OrdenCompraDto> ordenesP,
			List<RodamientoDto> rodamientos,
			List<RodamientoDto> listaComparativa) {
		super();
		this.ordenesP = ordenesP;
		this.rodamientos = rodamientos;
		this.listaComparativa = listaComparativa;
	}
	
	public CCDto(){
		
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
