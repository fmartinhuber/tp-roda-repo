package interfaces;

import java.rmi.*;
import java.util.List;

import dto.*;

public interface IAdministracionODV extends Remote {

	/**
	 *   
	 * @return
	 * @throws RemoteException
	 */
	public List<RodamientoDto> obtenerRodamientos() throws RemoteException;
	
	
	/**
	 * consiste en la cotizaci�n al cliente de los rodamientos solicitados y este proceso se efect�a
	 * para cada pedido de cotizaci�n de los clientes.
	 * @param listaRodamientos
	 * @return
	 * @throws RemoteException
	 */
	public CotizacionDto generarCotizacion(List <RodamientoDto> listaRodamientos) throws RemoteException;
	
	/**
	 * consiste en la venta  al cliente de los �tems indicados  en un pedido de venta. 
	 * Los �tems pueden hacer referencia o no, a una o varias solicitudes de cotizaci�n anteriores, 
	 * la cual pueden estar vigentes o no.
	 * @param cliente
	 * @param cotizacion
	 * @return
	 * @throws RemoteException
	 */
	public FacturaDto generarFactura (ClienteDto cliente,CotizacionDto cotizacion) throws RemoteException;
	
	
	/**
	 * consiste en la recepci�n de la mercader�a enviada por la CC a las correspondientes OV para la confecci�n 
	 * de los env�os correspondientes y su posterior despacho a cada cliente, junto con la factura
	 *  y el remito correspondiente. 
	 * 
	 * @param cliente
	 * @param remito
	 * @return
	 * @throws RemoteException
	 */
	public EnvioDto entregaPedidos (ClienteDto cliente, RemitoDto remito) throws RemoteException;
	
}
