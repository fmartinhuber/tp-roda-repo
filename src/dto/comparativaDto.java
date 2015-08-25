package dto;

import java.util.List;

public class comparativaDto {

	/**
	 * La principal listado a consultar los rodamientos.
	 * La idea es que aca esten todos los rodamientos (uno de cada) con su mejor precio.
	 * 
	 */
	List <RodamientoDto> principal;
	/**
	 * En caso que no se disponga de stock o por X motivo se quiera utilizar otro rodamiento. 
	 */
	List <RodamientoDto> opcional;
	
	
}
