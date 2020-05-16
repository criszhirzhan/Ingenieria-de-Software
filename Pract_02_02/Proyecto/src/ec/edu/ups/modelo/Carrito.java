package ec.edu.ups.modelo;

import java.util.List;

public class Carrito {

	private int idCarrito;
	private int idCliente;
	private List<Pedido> pedidos;
	private double costoFinal;
	private double costoD;
	private double costoI;
	
	
	public  void agregarPedido(Pedido pedido) {
	}
	
	public void listarPedido() {
		
		for(int indice = 0;indice<pedidos.size();indice++)
		{
		    System.out.println("Detalle Compra: "+ pedidos.get(indice).getFechaPedido() + "Cliente: "+pedidos.get(indice).getIdPedido());
		    System.out.println("Libros Digitaleles: ");
			for(int indice1 = 0;indice1<pedidos.get(indice).getLibroDigital().size();indice1++)
			{
			    System.out.println("Nombre Libro: "+pedidos.get(indice).getLibroDigital().get(indice1).getTitulo() +"Cosoto Total: "+pedidos.get(indice).getLibroDigital().get(indice1).getCosto());
			costoD =pedidos.get(indice).getLibroDigital().get(indice1).getCosto();
		
			}
			System.out.println("Libros Impresos: ");
			for(int indice2 = 0;indice2<pedidos.get(indice).getLibrosImpresos().size();indice2++)
			{
			    System.out.println("Nombre Libro: "+pedidos.get(indice).getLibrosImpresos().get(indice2).getTitulo() +"Cosoto Total: "+pedidos.get(indice).getLibrosImpresos().get(indice2).getCosto());
			costoI =pedidos.get(indice).getLibrosImpresos().get(indice2).getCosto();
			}
		}
		
		costoFinal= costoD+costoI;
		System.out.println("Precio final a pagar :"+costoFinal);
	}
	
	//--------------------------------------------------------
	
	public Carrito() {
		
	}

	public Carrito(int idCarrito, int idCliente, List<Pedido> pedidos) {
		super();
		this.idCarrito = idCarrito;
		this.idCliente = idCliente;
		this.pedidos=pedidos;
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
	

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", idCliente=" + idCliente + "]";
	}
	
	
	
	
}
