package interfaces;

import java.rmi.*;
import java.util.*;

import utils.ItemDto;
import dto.*;



public interface IAdministracionCC extends Remote {

	/**
	 * Casa Central - Punto 1 - Administrar cartera de proveedores
	 * Formalmente: Consiste en el ABM de la cartera de proveedores.
	 * 
	 * Coloquialmente: ABM de Proveedores, lo hago unificado para no tener 3 metodos distintos. El parametro 'accion' 
	 * tendra el string de la accion a realizar (Alta, Baja, Modificacion, Consulta), y el metodo se encargara de resolverlo
	 * 
	 * Lo hace: A definir (Esto deberia ser lo ultimo en hacerse)
	 *
	 * @param ProveedorDto, String
	 * @return Boolean
	 * @throws RemoteException
	 */
	public void crearProveedor (ProveedorDto proveedor) throws RemoteException;
	public void eliminarProveedor (ProveedorDto proveedor) throws RemoteException;
	public void modificarProveedor (ProveedorDto proveedor) throws RemoteException;
	
	
	
	/**
	 * Casa Central - Punto 2 y 3 - Administrar listas de precios de proveedores
	 * Formalmente: (2) Cada proveedor presenta una o m�s listas de precios de rodamientos. Las mismas pueden 
	 * o no incluir cantidad de stock disponible. (3) Servicio disponible para las OV generado por la CC donde 
	 * figura para cada rodamiento el menor precio de venta
	 * 
	 * Coloquialmente: La idea es que devuelva la lista que ya tiene CCDto y que cada vez que se agregue 
	 * algun producto se auto actualice. Cada Rodamiento conoce a su proveedor y el proveedor conoce sus 
	 * rodamientos. (OJO STRATEGY)
	 * 
	 * Lo hace: Martin
	 * 
	 * @param List <RodamientoDto>
	 * @return List <RodamientoDto>
	 * @throws RemoteException
	 */	
	public List <RodamientoDto> obtenerListaComparativa () throws RemoteException;
	
	//public List <RodamientoDto> obtenerListaComparativaOpcional () throws RemoteException;
	
	//public void actualizarListaComparativa(List <RodamientoDto> listado) throws RemoteException;
	
	
	
	/**
	 * Casa Central - Punto 4 - Compra de rodamientos
	 * Formalmente: Consiste en la compra a los proveedor(es) de los �tems indicados en las solicitudes 
	 * de compra enviada por las OV.
	 * 
	 * Coloquialmente: Recibe solicitudes de cotizaciones CONFIRMADAS y genera ORDENES DE COMPRA a los proveedores.  
	 * 
	 * Lo hace: Carlos
	 * 
	 * @param List <CotizacionDto>
	 * @return List<OrdenCompraDto>
	 * @throws RemoteException
	 */
	public List <OrdenCompraDto> crearOrdenCompra (List <SolicitudCompraDto> listaCotizaciones, String formaDePago) throws RemoteException;
	
	public List <OrdenCompraDto> crearOrdenCompraXid (List<String> idsCotis, String formaDePago) throws RemoteException;
	
	public List <OrdenCompraDto> obtenerOrdenesCompra () throws RemoteException;
	
	public void aprobarOrdenCompra (int nroOrden) throws RemoteException;
	
	
	
	/**
	 * Punto 6.
	 * Formalmente: Consiste en la actualizacion del stock a partir de la orden de compra
	 * 
	 * Coloquialmente: Casi un ABM de Stock. Recibe una lista de rodamientos y un String accion, el cual indicara
	 * como en los otros ABM que se debe hacer con esos rodamientos (Cuando se compra se hace Alta, cuando se vende
	 * se hace Baja). Tanto en Altas como Bajas el metodo debe actualizar los precios del stock con el 
	 * precio promedio de mercado (de donde saco esto??)
	 * OJO: Muchas restricciones que lo hacen complejo	 
	 * 
	 * Autor: Rama
	 * 
	 * @param List <RodamientoDto>
	 * @return void
	 * @throws RemoteException
	 */
	public void actualizarStock (List <ItemDto> listaRodamientos, String accion) throws RemoteException;
	
}
