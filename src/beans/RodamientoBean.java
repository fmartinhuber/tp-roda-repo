package beans;

import java.io.Serializable;

public class RodamientoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;	
	private float precio;
	private String marca;
	private String origen;
	
	public RodamientoBean(String codigo, float precio, String marca, String origen) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.marca = marca;
		this.origen = origen;
	}
	
	public RodamientoBean(){}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	};
	
	
	
}
