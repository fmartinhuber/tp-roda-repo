package interfaces;

import java.rmi.Remote;

public interface IAdministracionGeneral extends Remote {

	//ABM CLIENTES y otras yerbas.
	
	public void altaCliente();
	
	public void bajaCliente();
	
	public void bajaProveedor();
	
	public void altaProveedor();
}
