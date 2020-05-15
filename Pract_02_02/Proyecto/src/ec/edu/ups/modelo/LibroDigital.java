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
		
		return idLibro;
		
	}

	@Override
	public double debitoCredito(double debitoCliente) {
		
		return ((calcularCostoComision()+getCosto())-debitoCliente);
		
	}

	public  LibroDigital() {
	// TODO Auto-generated constructor stub
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
