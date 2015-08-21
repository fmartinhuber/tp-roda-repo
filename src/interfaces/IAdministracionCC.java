package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.CotizacionDto;
import dto.OrdenCompraDto;
import dto.RemitoDto;
import dto.RodamientoDto;

public interface IAdministracionCC extends Remote {

	
	/**
	 * La idea es que devuelva la lista que ya tiene CCDto y que cada vez que se agregue algun producto
	 * se auto actualice. 
	 * Cada Rodamiento conoce a su proveedor y el proveedor conoce sus rodamientos.
	 * @return
	 * @throws RemoteException
	 */
	public List <RodamientoDto> listaComparativa () throws RemoteException;
	
	/**
	 * consiste en la compra al o los proveedor(es) de los ítems indicados  en las solicitudes de compra enviada por las OV.
	 * @param cotizacion
	 * @return
	 * @throws RemoteException
	 */
	public OrdenCompraDto generarOrden (CotizacionDto cotizacion) throws RemoteException;
	
	/**
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public RemitoDto generacionRemito () throws RemoteException;
	
}
