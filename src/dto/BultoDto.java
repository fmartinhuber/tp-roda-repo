package dto;

import java.util.*;

import utils.ItemDto;



public class BultoDto {

	private List <ItemDto> rodamientos;
	private ClienteDto cliente;
	private RemitoDto remito;
	
	
	
	public BultoDto(List<ItemDto> rodamientos, ClienteDto cliente,
			RemitoDto remito) {
		super();
		this.rodamientos = rodamientos;
		this.cliente = cliente;
		this.remito = remito;
	}
	
	public BultoDto(){
		
	}

	public List<ItemDto> getRodamientos() {
		return rodamientos;
	}

	public void setRodamientos(List<ItemDto> rodamientos) {
		this.rodamientos = rodamientos;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public RemitoDto getRemito() {
		return remito;
	}

	public void setRemito(RemitoDto remito) {
		this.remito = remito;
	}
	

}
