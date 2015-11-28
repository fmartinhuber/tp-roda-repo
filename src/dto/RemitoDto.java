package dto;

import java.io.Serializable;
import java.util.*;



public class RemitoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int numeroRemito;
	private String estado;
	private List <OrdenCompraDto> ordenesDeCompra;
	private Date fecha;
	private String comentarios;
	
	
	
	public RemitoDto(int numeroRemito, String estado,
			List<OrdenCompraDto> ordenesDeCompra, Date fecha, String comentarios) {
		super();
		this.numeroRemito = numeroRemito;
		this.estado = estado;
		this.ordenesDeCompra = ordenesDeCompra;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}

	public RemitoDto(){
		
	}

	public int getNumeroRemito() {
		return numeroRemito;
	}

	public void setNumeroRemito(int numeroRemito) {
		this.numeroRemito = numeroRemito;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<OrdenCompraDto> getOrdenesDeCompra() {
		return ordenesDeCompra;
	}

	public void setOrdenesDeCompra(List<OrdenCompraDto> ordenesDeCompra) {
		this.ordenesDeCompra = ordenesDeCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
