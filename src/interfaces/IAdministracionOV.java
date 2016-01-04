package interfaces;

import java.rmi.*;
import java.util.*;

import utils.*;
import dto.*;



public interface IAdministracionOV extends Remote {
		
	/** 
	 * Oficina de Venta - Punto 1 - Cotización de Solicitud de Rodamiento
	 * Formalmente: Consiste en la cotización al cliente de los rodamientos solicitados y este proceso 
	 * se efectúa para cada pedido de cotización de los clientes.
	 * 
	 * Coloquialmente: Este metodo se encarga de devolverte la Cotizacion que le pediste, siendo 
	 * cada "item" pedido un itemCotizacion. Levanta el XML que se genera cuando el cliente hace el
	 * pedido por la pagina web y con eso genera la Cotizacion.
	 * 
	 * Lo hace: Daro 
	 * 
	 * @param List <Item> (Utilidad, rodamiento con su cantidad), ClienteDto
	 * @return CotizacionDto
	 * @throws RemoteException
	 */
	//Crea la cotizacion y la deja en estado "pendiente". Devuelve el id de la cotizacion creada
	public CotizacionDto crearCotizacion (List <ItemDto> listaItems, ClienteDto clienteDto) throws RemoteException;
	
	//Actualiza el estado a "cotizada", devuelve float que es el precio de la Cotizacion
	public float cotizarCotizacion (int idCotizacion) throws RemoteException;
	
	//Actualiza el estado a "aprobada"
	public void aprobarCotizacion (int idCotizacion) throws RemoteException;
	
	
	
	/** 
	 * Oficina de Venta - Punto 2 - Venta de rodamientos
	 * Formalmente: Consiste en la venta  al cliente de los ítems indicados  en un pedido de venta. 
	 * Los ítems pueden hacer referencia o no, a una o varias solicitudes de cotización anteriores, 
	 * la cual pueden estar vigentes o no.
	 * 
	 * Coloquialmente: No tenemos estado de cotización por items, por lo que trataremos solo las cotizaciones en estado "aprobada"
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
	public FacturaDto generarFactura (List<CotizacionDto> cotizaciones, ClienteDto cliente) throws RemoteException;
	
	
	
	/** 
	 * Oficina de Venta - Punto 3 - Logística de Entrega de Pedidos
	 * Formalmente: Consiste en la recepción de la mercadería enviada por la CC a las correspondientes OV para 
	 * la confección de los envíos correspondientes y su posterior despacho a cada cliente, junto con la factura 
	 * y el remito correspondiente.
	 * 
	 * Coloquialmente: BultoDto es la clase que se genera cuando CC le pasa las cosas a la OV, este metodo
	 * usa el Remito para generar esta nueva clase, la cual sera usada por la OV de aca en mas. Es solo una 
	 * transformacion de documento
	 * 
	 * Cambios!!: Bulto deja de existir ya que no es algo persistible. Solamente se enviara el Remito
	 * generados en CC a OV
	 * 
	 * Lo hace: Daro
	 * 
	 * @param RemitoDto
	 * @return EnvioAOVDto
	 * @throws RemoteException
	 */
	public void entregaPedidos (RemitoDto remDto) throws RemoteException;
	
	/**
	 * Casa Central - Punto 5 - Recepcion de rodamientos
	 * Formalmente: Consiste en la recepcion de la mercaderia solicitada a los proveedores, su control y la 
	 * confeccion de los bultos para las OV. 
	 * 
	 * Coloquialmente: Recibe ordenes de compra parciales o completas y emite remitos a las OV.
	 * OJO: Genera varios XML molestos
	 * 
	 * Lo hace: Rama
	 * 
	 * @param List <OrdenCompraDto>
	 * @return RemitoDto
	 * @throws RemoteException
	 */
	//public int crearRemito (List <OrdenCompraDto> listaOrdenes, ProveedorDto proveedor) throws RemoteException;
	public RemitoDto crearRemito (List <OrdenCompraDto> listaOrdenes) throws RemoteException;
	
	
	/** 
	 * Oficina de Venta - Punto 4 - Administración de clientes
	 * Formalmente: Consiste en el ABM de la cartera de clientes. Los clientes pueden ser industrias, talleres, 
	 * fábricas y revendedores de rodamientos.
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
	 * @return 
	 * @throws RemoteException
	 */
	public void crearCliente (ClienteDto cliente) throws RemoteException;
	public void eliminarCliente (ClienteDto cliente) throws RemoteException;
	public void modificarCliente (ClienteDto cliente) throws RemoteException;
		
	public List <CotizacionDto> obtenerCotizacionesAprobadas () throws RemoteException;
	
	/**
	 * Daro
	 * 
	 * Toma todas las cotizaciones aprobadas de la base y genera una solicitud de compra.
	 * 
	 * @throws RemoteException
	 */
	public SolicitudCompraDto crearSolicitudCompra (List <CotizacionDto> cotizacionesAprobadas) throws RemoteException;
	
	/**
	 * @return
	 * @throws RemoteException
	 */
	public List <CotizacionDto> obtenerCotizaciones() throws RemoteException;
	
	/**
	 * @return
	 * @throws RemoteException
	 */
	public List <SolicitudCompraDto> obtenerSolicitudesPendientes() throws RemoteException;
	
	/**
	 * Encargado de obtener el cliente = usuario que se loguea desde la BS.
	 * @param usuario
	 * @param contrasena
	 * @return
	 * @throws RemoteException
	 */
	public ClienteDto obtenerUsuario(String usuario, String contrasena) throws RemoteException;
	
	/**
	 * Volver a obtener el usuario = cliente ya logueado.
	 * @return
	 * @throws RemoteException
	 */
	public ClienteDto obtenerUsuarioLogueado () throws RemoteException;
	
	public CotizacionDto obtenerCotizaciones(int id) throws RemoteException;
	
	public List <RodamientoDto> obtenerRodamientos() throws RemoteException;
}
