package dto;

import java.util.List;

/**
 * @author Daro: Martin, esto ahora esta en Negocio. Se deberia borrar aca de DTO creo, fijate
 *
 */

public class ComparativaDto {

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
