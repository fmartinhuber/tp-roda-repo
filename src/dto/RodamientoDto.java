package dto;

import java.io.Serializable;



public class RodamientoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String codigo;
	private int stock;
	private int serie;
	private String origen;
	private String marca;
	private String descripcion;
	private float monto;
	private float costo;
	private ProveedorDto proveedor;
	
	
	
	public RodamientoDto(String tipo, String codigo, int stock, int serie,
			String origen, String marca, String descripcion, float monto,
			float costo, ProveedorDto proveedor) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.stock = stock;
		this.serie = serie;
		this.origen = origen;
		this.marca = marca;
		this.setDescripcion(descripcion);
		this.monto = monto;
		this.costo = costo;
		this.proveedor = proveedor;
	}

	public RodamientoDto(){
		
	}

	public float getMonto() {
		return monto;
	}
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSerie() {
		return serie;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public ProveedorDto getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(ProveedorDto proveedor) {
		this.proveedor = proveedor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
