package ec.edu.ups.modelo;

public class libroImpreso extends Libro{
	private String idLibro;
	private int stock;
	

	@Override
	public double calcularPrecioNeto() {
		return stock;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularCostoComision() {
		return stock;
		
	}

	@Override
	public double calcularCostoEnvio() {
		// TODO Auto-generated method stub
		return stock;
		
	}

	@Override
	public double debitoCredito() {
		// TODO Auto-generated method stub
		return stock;
		
	}

	

	// -------------------------------------------------------
	 public libroImpreso() {
		// TODO Auto-generated constructor stub
	}
	
	 
	
	public libroImpreso(String idLibro, int stock) {
		super();
		this.idLibro = idLibro;
		this.stock = stock;
	}
	

	public String getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "libroImpreso [idLibro=" + idLibro + ", stock=" + stock + "]";
	}
	
	
}
