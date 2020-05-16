package ec.edu.ups.modelo;

public class libroImpreso extends Libro{
	private int idLibro;
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
	
	


	

	public libroImpreso(int idLibro, String titulo, String autor, String edicion, double costo, int stock) {
		super(titulo, autor, edicion, costo);
		// TODO Auto-generated constructor stub
		this.idLibro= idLibro;
		this.stock=stock;
	}

	// -------------------------------------------------------
	 public libroImpreso() {
		// TODO Auto-generated constructor stub
	}
	
	 
	
	public libroImpreso(int idLibro, int stock) {
		super();
		this.idLibro = idLibro;
		this.stock = stock;
	}
	

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
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
