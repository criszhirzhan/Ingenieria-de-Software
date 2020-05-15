package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

public abstract class Pedido {
	private int idPedido;
	private int idCliente;
	private Date fechaPedido;
	private List libroDigital;
	private List librosImpresos;
	
	public Pedido() {
		
	}
	
	public  void agregarLibrosDigitales(LibroDigital libro) {
	
	}
	
	public  void agregarLibrosImpresos(libroImpreso libroI) {
	
	}

	
	public Pedido(int idPedido, int idCliente, Date fechaPedido, List libroDigital, List librosImpresos) {
		super();
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

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public List getLibroDigital() {
		return libroDigital;
	}

	public void setLibroDigital(List libroDigital) {
		this.libroDigital = libroDigital;
	}

	public List getLibrosImpresos() {
		return librosImpresos;
	}

	public void setLibrosImpresos(List librosImpresos) {
		this.librosImpresos = librosImpresos;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", idCliente=" + idCliente + ", fechaPedido=" + fechaPedido
				+ ", libroDigital=" + libroDigital + ", librosImpresos=" + librosImpresos + "]";
	}
	
	
	
	
}
