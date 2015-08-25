package interfaces;

import java.rmi.*;
import java.util.*;

import dto.*;

/**
 * @author Daro
 *
 */
public interface IAdministracionCC extends Remote {

	/**
	 * Casa Central - Punto 1 - Administrar cartera de proveedores
	 * Consiste en el ABM de la cartera de proveedores.
	 * 
	 * Daro: ABM de Proveedores, lo hago unificado para no tener 3 metodos distintos. El parametro 'accion' 
	 * tendra el string de la accion a realizar (Alta, Baja, Modificacion), y el metodo se encargara de resolverlo
	 * 
	 * Autor: 
	 *
	 * @param ProveedorDto, String
	 * @return Boolean
	 * @throws RemoteException
	 */
	public boolean abmProveedor (ProveedorDto proveedor, String accion) throws RemoteException;
	
	
	
	/**
	 * Casa Central - Punto 2 y 3 - Administrar listas de precios de proveedores
	 * Cada proveedor presenta una o más listas de precios de rodamientos. Las mismas pueden o no incluir 
	 * cantidad de stock disponible.
	 * 
	 * La idea es que devuelva la lista que ya tiene CCDto y que cada vez que se agregue algun producto
	 * se auto actualice. Cada Rodamiento conoce a su proveedor y el proveedor conoce sus rodamientos.
	 * (OJO STRATEGY)
	 * Autor: Martin
	 * 
	 * @param List <RodamientoDto>
	 * @return List <RodamientoDto>
	 * @throws RemoteException
	 */
	public List <RodamientoDto> obtenerListaComparativa (List <RodamientoDto> listaRodamientosNueva) throws RemoteException;
	
	
	
	/*Daro TODO: Hacer y documentar bien los metodos que faltan de aca en mas para CC*/
	
	
	/**
	 * Punto 4
	 * consiste en la compra al o los proveedor(es) de los ítems indicados  en las solicitudes de compra enviada por las OV.
	 * Recibe solicitudes de cotizaciones CONFIRMADAS y genera ORDENES DE COMPRA a los proveedores.  
	 * 
	 * Autor: CHARLY
	 * 
	 * @param cotizacion
	 * @return
	 * @throws RemoteException
	 */
	public List<OrdenCompraDto> crearOrden (List <CotizacionDto> listaCotizaciones) throws RemoteException;
	
	
	
	/**
	 * Punto 5 
	 * Consiste e nl a recepcion de la mercaderia solicitada a los proveedores, su control y la confeccion de los bultos para las OV. 
	 * Recibe oredenes de compra parciales o completas y emite remitos a las OV.  
	 * 
	 * Auto: 
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public RemitoDto crearRemito (List <OrdenCompraDto> listaOrdenes) throws RemoteException;
	
	
	/**
	 * Punto 6.
	 * COnsiste en la actualizacion del stock a partir de la orden de compra. 
	 * 
	 * Autor; 
	 * 
	 * @param listaRodamientos
	 * @throws RemoteException
	 */
	public void actualizarStock (List <RodamientoDto> listaRodamientos) throws RemoteException;
	
}
