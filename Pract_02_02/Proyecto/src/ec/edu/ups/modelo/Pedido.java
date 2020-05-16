package ec.edu.ups.modelo;


import java.util.Date;
import java.util.List;

public  class Pedido {
	private int idPedido;
	private int idCliente;
	private String fechaPedido;
	private List<LibroDigital> libroDigital;
	private List<libroImpreso> librosImpresos;
	
	public Pedido() {
		
	}
	
	public  void agregarLibrosDigitales(LibroDigital libro) {
	
	}
	
	public  void agregarLibrosImpresos(libroImpreso libroI) {
	
	}

	
	public Pedido(int idPedido, int idCliente, String fechaPedido, List<LibroDigital> libroDigital, List<libroImpreso> librosImpresos) {
	
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.fechaPedido = fechaPedido;
		this.libroDigital = libroDigital;
		this.librosImpresos = librosImpresos;
	}

	//----------------------------------------------------------------------------
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public List<LibroDigital> getLibroDigital() {
		return libroDigital;
	}

	public void setLibroDigital(List<LibroDigital> libroDigital) {
		this.libroDigital = libroDigital;
	}

	public List<libroImpreso> getLibrosImpresos() {
		return librosImpresos;
	}

	public void setLibrosImpresos(List<libroImpreso> librosImpresos) {
		this.librosImpresos = librosImpresos;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", idCliente=" + idCliente + ", fechaPedido=" + fechaPedido
				+ ", libroDigital=" + libroDigital + ", librosImpresos=" + librosImpresos + "]";
	}
	
	
	
	
}
