package ec.edu.ups.modelo;

public class LibroDigital extends Libro {
	
	private int idLibro;

	


	@Override
	public double calcularCostoComision() {
		return (getCosto()*5)/(100);
		// TODO Auto-generated method stub	
	}

	@Override
	public double calcularCostoEnvio() {
		
		return 0.0;
		
	}

	@Override
	public double debitoCredito(double debitoCliente) {
		
		return ((debitoCliente-calcularCostoComision()+getCosto()));
		
	}
	
	
	

	
	


	
	public LibroDigital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibroDigital(int idLibro,  String titulo, String autor, String edicion, double costo) {
		super(titulo, autor, edicion, costo);
		// TODO Auto-generated constructor stub
		this.idLibro=idLibro;
	}

	//Generamos  -----------------
	public LibroDigital(int idLibro) {
		super();
		this.idLibro = idLibro;
	}
	
	
	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	@Override
	public String toString() {
		return "LibroDigital [idLibro=" + idLibro + "]";
	}

	
	
	
}
