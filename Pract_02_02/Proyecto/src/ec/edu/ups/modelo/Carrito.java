package ec.edu.ups.modelo;

import java.util.List;

public class Carrito {

	private int idCarrito;
	private int idCliente;
	
	public  void agregarPedido(Pedido pedido) {
	}
	
	public List listarPedido() {
		List listaP = null;
		
		return listaP;
	}
	
	//--------------------------------------------------------
	
	public Carrito() {
		
	}

	public Carrito(int idCarrito, int idCliente) {
		super();
		this.idCarrito = idCarrito;
		this.idCliente = idCliente;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", idCliente=" + idCliente + "]";
	}
	
	
	
}
