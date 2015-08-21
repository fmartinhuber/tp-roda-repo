package dto;

import java.util.List;

public class EnvioDto {

	private List <RodamientoDto> rodamientos;
	
	private ClienteDto cliente;

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public List <RodamientoDto> getRodamientos() {
		return rodamientos;
	}

	public void setRodamientos(List <RodamientoDto> rodamientos) {
		this.rodamientos = rodamientos;
	}
}
