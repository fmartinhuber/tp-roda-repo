package interfaces;

import java.rmi.*;
import java.util.List;

import dto.*;

public interface IAdministracionCliente extends Remote {

	/* 
	De ClienteDtO
	private String razonSocial;
	private String mail;
	private int CUIT;
	private int unidades;
	private int meses;
	private int operaciones;
	 */
	
	public void crearCliente(String razonSocial, String mail, int CUIT, int unidades, int meses, int operaciones) throws RemoteException;
	
	public void eliminarCliente(int CUIT) throws RemoteException;
	
	public void modificarCliente(ClienteDto cliente) throws RemoteException;
	
	public ClienteDto obtenerCliente(int CUIT) throws RemoteException;
	
	public List<ClienteDto> listarClientes() throws RemoteException;
	
}
