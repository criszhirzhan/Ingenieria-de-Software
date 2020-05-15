package ec.edu.ups.modelo;

public class libroImpreso extends Libro{
	private String idLibro;
	private int stock;
	


	@Override
	public double calcularCostoComision() {
		return ((getCosto()+2)/(100));
		
	}

	@Override
	public double calcularCostoEnvio() {
		// TODO Auto-generated method stub
		return 20.00;
		
	}

	@Override
	public double debitoCredito(double debitoCliente) {
		// TODO Auto-generated method stub
		return ((calcularCostoComision()+calcularCostoEnvio())-debitoCliente);
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
