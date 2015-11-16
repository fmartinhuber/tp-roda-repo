package interfaces;

import java.rmi.*;
import java.util.*;

import utils.*;
import dto.*;



public interface IAdministracionOV extends Remote {
		
	/** 
	 * Oficina de Venta - Punto 1 - Cotizaci�n de Solicitud de Rodamiento
	 * Formalmente: Consiste en la cotizaci�n al cliente de los rodamientos solicitados y este proceso 
	 * se efect�a para cada pedido de cotizaci�n de los clientes.
	 * 
	 * Coloquialmente: Este metodo se encarga de devolverte la Cotizacion que le pediste, siendo 
	 * cada "item" pedido un itemCotizacion. Levanta el XML que se genera cuando el cliente hace el
	 * pedido por la pagina web y con eso genera la Cotizacion.
	 * 
	 * crearCotizacion: Crea la cotizacion y la deja en estado "pendiente". Devuelve la Cotizacion
	 * aprobarCotizacion: Actualiza el estado a "aprobada", devuelve float que es el precio de la Cotizacion
	 * rechazarCotizacion: Actualiza el estado a "rechazada"
	 * 
	 * Lo hace: Daro 
	 * 
	 * @param List <Item> (Utilidad, rodamiento con su cantidad), ClienteDto
	 * @return CotizacionDto
	 * @throws RemoteException
	 */
	public void crearCotizacion (ClienteDto cliente) throws RemoteException;
	public float aprobarCotizacion (List <ItemDto> listaItems, CotizacionDto miCotDto) throws RemoteException;
	public void rechazarCotizacion (CotizacionDto miCotDto) throws RemoteException;
	
	
	
	/** 
	 * Oficina de Venta - Punto 2 - Venta de rodamientos
	 * Formalmente: Consiste en la venta  al cliente de los �tems indicados  en un pedido de venta. 
	 * Los �tems pueden hacer referencia o no, a una o varias solicitudes de cotizaci�n anteriores, 
	 * la cual pueden estar vigentes o no.
	 * 
	 * Coloquialmente: No tenemos estado de cotizaci�n por items, por lo que trataremos solo las cotizaciones en estado "aprobada"
	 * El tratamiento sera el siguiente; se tomaran todas las cotizaiones en estado "aprobada" y se cambiara el estado a "solicitada"
	 * estas cotiaciones seran tomas por la CC para generar las Ordenes de Compra al proveedor.
	 * Genera la factura para un cliente con todas sus cotizaciones realizadas (no se envia al cliente, solo se genera)
	 * 
	 * Lo hace: Charly
	 * 
	 * @param ClienteDto, List<CotizacionDto>
	 * @return FacturaDto
	 * @throws RemoteException
	 */
	public FacturaDto crearFactura (ClienteDto cliente, CotizacionDto cotizacion) throws RemoteException;
	
	
	
	/** 
	 * Oficina de Venta - Punto 3 - Log�stica de Entrega de Pedidos
	 * Formalmente: Consiste en la recepci�n de la mercader�a enviada por la CC a las correspondientes OV para 
	 * la confecci�n de los env�os correspondientes y su posterior despacho a cada cliente, junto con la factura 
	 * y el remito correspondiente.
	 * 
	 * Coloquialmente: EnvioAOVDto es la clase que se genera cuando CC le pasa las cosas a la OV, este metodo
	 * usa el Remito para generar esta nueva clase, la cual sera usada por la OV de aca en mas. Es solo una 
	 * transformacion de documento
	 * 
	 * Lo hace: Daro
	 * 
	 * @param RemitoDto
	 * @return EnvioAOVDto
	 * @throws RemoteException
	 */
	public EnvioAOVDto entregaPedidos (RemitoDto remito) throws RemoteException;
	
	
	
	/** 
	 * Oficina de Venta - Punto 4 - Administraci�n de clientes
	 * Formalmente: Consiste en el ABM de la cartera de clientes. Los clientes pueden ser industrias, talleres, 
	 * f�bricas y revendedores de rodamientos.
	 * 
	 * Coloquialmente: ABM de Clientes, lo hago unificado para no tener 3 metodos distintos. El parametro 'accion' 
	 * tendra el string de la accion a realizar (Alta, Baja, Modificacion, Consulta), y el metodo se encargara 
	 * de resolverlo internamente (Ej: Si el parametro es alta, hace el alta y devuelve true si se realizo correctamente)
	 * (Depende de la accion que se pida, los atributos que seran utilizados por el cliente. Ej: Para una baja solo
	 * se necesitaria un atributo unico del cliente, el DNI)
	 * 
	 * Lo hace: A definir (Esto deberia ser lo ultimo en hacerse)
	 *
	 * @param ClienteDto, String
	 * @return Boolean
	 * @throws RemoteException
	 */
	public boolean abmCliente (ClienteDto cliente, String accion) throws RemoteException;
	
	
	/**
	 * Esto quedo, ver para que se usa
	 * @return List<RodamientoDto>
	 * @throws RemoteException
	 */
	@Deprecated
	public List<RodamientoDto> obtenerRodamientos() throws RemoteException;
}
