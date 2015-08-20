package interfaces;

import java.rmi.*;
import java.util.List;

import dto.*;

public interface IAdministracionODV extends Remote {

	// public List<ReparacionDto> obtenerReparaciones() throws RemoteException;	
	public List<RodamientoDto> obtenerRodamientos() throws RemoteException;
	
	
	
}
