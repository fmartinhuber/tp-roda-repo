package dto;

import java.io.Serializable;



public class RodamientoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String codigo;
	private int stock;
	private String origen;
	private String marca;
	private String caracteristica;
	private float monto;
	private ProveedorDto proveedor;
	
	
	
	public RodamientoDto(String tipo, String codigo, int stock, String origen,
			String marca, String caracteristica, float monto,
			ProveedorDto proveedor) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.stock = stock;
		this.origen = origen;
		this.marca = marca;
		this.caracteristica = caracteristica;
		this.monto = monto;
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

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
