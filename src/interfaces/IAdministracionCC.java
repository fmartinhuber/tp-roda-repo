package interfaces;

import java.rmi.*;
import java.util.*;

import dto.*;

/**
 * @author Daro
 *
 */
public interface IAdministracionCC extends Remote {

	/** Casa Central - Punto 1 - Administrar cartera de proveedores
	 * Consiste en el ABM de la cartera de proveedores.
	 * 
	 * @author Daro: ABM de Proveedores, lo hago unificado para no tener 3 metodos distintos. El parametro 'accion' 
	 * tendra el string de la accion a realizar (Alta, Baja, Modificacion), y el metodo se encargara de resolverlo
	 *
	 * @param ProveedorDto, String
	 * @return Boolean
	 * @throws RemoteException
	 */
	public boolean abmProveedor (ProveedorDto proveedor, String accion) throws RemoteException;
	
	
	
	/** Casa Central - Punto 2 - Administrar listas de precios de proveedores
	 * Cada proveedor presenta una o más listas de precios de rodamientos. Las mismas pueden o no incluir 
	 * cantidad de stock disponible.
	 * 
	 * @author Martin: La idea es que devuelva la lista que ya tiene CCDto y que cada vez que se agregue algun producto
	 * se auto actualice. Cada Rodamiento conoce a su proveedor y el proveedor conoce sus rodamientos.
	 * 
	 * @param List <RodamientoDto>
	 * @return List <RodamientoDto>
	 * @throws RemoteException
	 */
	public List <RodamientoDto> listaComparativa (List <RodamientoDto> listaRodamientosNueva) throws RemoteException;
	
	
	
	/*Daro TODO: Hacer y documentar bien los metodos que faltan de aca en mas para CC*/
	
	
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
