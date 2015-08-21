package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class RemitoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numero;
	private String estado;
	private ClienteDto cliente;
	private List <CotizacionDto> cotizaciones;
	private String comentarios;
	private Date fecha;
	private boolean conformidad;
	
	
}
