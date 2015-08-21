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
	 * consiste en la cotización al cliente de los rodamientos solicitados y este proceso se efectúa
	 * para cada pedido de cotización de los clientes.
	 * @param listaRodamientos
	 * @return
	 * @throws RemoteException
	 */
	public CotizacionDto generarCotizacion(List <RodamientoDto> listaRodamientos) throws RemoteException;
	
	/**
	 * consiste en la venta  al cliente de los ítems indicados  en un pedido de venta. 
	 * Los ítems pueden hacer referencia o no, a una o varias solicitudes de cotización anteriores, 
	 * la cual pueden estar vigentes o no.
	 * @param cliente
	 * @param cotizacion
	 * @return
	 * @throws RemoteException
	 */
	public FacturaDto generarFactura (ClienteDto cliente,CotizacionDto cotizacion) throws RemoteException;
	
	
	/**
	 * consiste en la recepción de la mercadería enviada por la CC a las correspondientes OV para la confección 
	 * de los envíos correspondientes y su posterior despacho a cada cliente, junto con la factura
	 *  y el remito correspondiente. 
	 * 
	 * @param cliente
	 * @param remito
	 * @return
	 * @throws RemoteException
	 */
	public EnvioDto entregaPedidos (ClienteDto cliente, RemitoDto remito) throws RemoteException;
	
}
