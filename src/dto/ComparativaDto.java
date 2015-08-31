package dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
	
	public ComparativaDto(){
		principal = new ArrayList <RodamientoDto> ();
		opcional = new ArrayList <RodamientoDto> ();
	}
	
	
	public void agregarNuevoRodamiento (RodamientoDto rodamiento){
		Iterator <RodamientoDto> iterador = principal.iterator();
		boolean encontradoP = false, actualizadoP = false; 
		while(iterador.hasNext() && !encontradoP){
			RodamientoDto rodamientoComp = iterador.next();
			if(rodamientoComp.getCodigo().equals(rodamiento.getCodigo())){
				encontradoP = true;
				//si es mas barato
				if(rodamientoComp.getMonto() < rodamiento.getMonto()){
					actualizadoP = true; 
					principal.remove(rodamientoComp);
					principal.add(rodamiento);
				}
			}
		}
		if(encontradoP && !actualizadoP){
			opcional.add(rodamiento);
		}
		if(!encontradoP && !actualizadoP){
			iterador = opcional.iterator();
			while(iterador.hasNext() && !encontradoP){
				RodamientoDto rodamientoComp = iterador.next();
				if(rodamientoComp.getCodigo().equals(rodamiento.getCodigo())){
					opcional.add(rodamiento);
					actualizadoP = true;
				}
			}
		}
		if(!actualizadoP){
			opcional.add(rodamiento);
		}
	}
	
	public RodamientoDto consultaMejorRodamiento (int codigo, int cantidad){
		return null;
	}
}