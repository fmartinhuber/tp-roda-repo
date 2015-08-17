package interfaces;

import java.rmi.*;
import java.util.List;

import beans.*;

public interface ManejoDatos extends Remote {

	// public List<ReparacionDto> obtenerReparaciones() throws RemoteException;	
	public List<RodamientoBean> obtenerRodamientos() throws RemoteException;
	
}
