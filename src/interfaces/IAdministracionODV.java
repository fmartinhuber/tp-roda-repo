package interfaces;

import java.rmi.*;
import java.util.List;

import utils.*;
import dto.*;

/**
 * @author Daro:
 * Modo de interaccion del sistema
 * Proveedores <-> CC <-> OV <-> Clientes
 * Proveedores <-> Sistema <-> Clientes
 */
public interface IAdministracionODV extends Remote {
	
	
	/**
	 * Esto quedo, ver para que se usa
	 * @return List<RodamientoDto>
	 * @throws RemoteException
	 */
	public List<RodamientoDto> obtenerRodamientos() throws RemoteException;
	
	
	/** Oficina de Venta - Punto 1
	 * Consiste en la cotización al cliente de los rodamientos solicitados y este proceso se efectúa
	 * para cada pedido de cotización de los clientes.
	 * 
	 * @author Daro: Este metodo se encarga de devolverte la Cotizacion que le pediste, siendo cada "item" 
	 * pedido un itemCotizacion
	 * 
	 * @param List <Item> (Utilidad, rodamiento con su cantidad), ClienteDto
	 * @return CotizacionDto
	 * @throws RemoteException
	 */
	public CotizacionDto generarCotizacion	(List <Item> listaItems, ClienteDto cliente) throws RemoteException;
	
	
	/** Oficina de Venta - Punto 2
	 * Consiste en la venta  al cliente de los ítems indicados  en un pedido de venta. 
	 * Los ítems pueden hacer referencia o no, a una o varias solicitudes de cotización anteriores, 
	 * la cual pueden estar vigentes o no.
	 * 
	 * @author Daro: Genera la factura para un cliente con todas sus cotizaciones realizadas
	 * 
	 * @param ClienteDto, List<CotizacionDto>
	 * @return FacturaDto
	 * @throws RemoteException
	 */
	public FacturaDto generarFactura (ClienteDto cliente, List<CotizacionDto> cotizaciones) throws RemoteException;
	
	
	/** Oficina de Venta - Punto 3
	 * Consiste en la recepción de la mercadería enviada por la CC a las correspondientes OV para la confección 
	 * de los envíos correspondientes y su posterior despacho a cada cliente, junto con la factura 
	 * y el remito correspondiente.
	 * 
	 * @author Daro: EnvioAOVDto es la clase que se genera cuando CC le pasa las cosas a la OV, este metodo
	 * usa el Remito para generar esta nueva clase, la cual sera usada por la OV de aca en mas. Es solo una 
	 * transformacion de documento
	 * 
	 * @param RemitoDto
	 * @return EnvioAOVDto
	 * @throws RemoteException
	 */
	public EnvioAOVDto entregaPedidos (RemitoDto remito) throws RemoteException;
	
}
