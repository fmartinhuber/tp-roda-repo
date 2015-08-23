package interfaces;

import java.rmi.Remote;

/**
 * @author Daro: Esta interfaz para mi se BORRA TODA, lo unico que hace es sacar de OV y CC los abm, al pedo
 * aparte se puede hacer mas facil sin tantos metodos como puse en la interfaz de OV
 *
 */
public interface IAdministracionGeneral extends Remote {

	//ABM CLIENTES y otras yerbas.
	
	public void altaCliente();
	
	public void bajaCliente();
	
	public void bajaProveedor();
	
	public void altaProveedor();
}
