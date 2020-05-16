package ec.edu.ups.modelo;

public abstract class Libro {

	
	private String titulo;
	private String autor;
	private String edicion;
	private double costo;
	
	
	public  double  calcularPrecioTotal() {
		return  (this.calcularCostoComision()+this.calcularCostoEnvio())+this.costo;
	}
	

	public abstract double calcularCostoComision();
	public abstract double calcularCostoEnvio();
	public abstract double debitoCredito(double debitoCliente);
	
	public Libro() {
		
	}
	public Libro(String titulo, String autor, String edicion, double costo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.edicion = edicion;
		this.costo=costo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", costo=" + costo + "]";
	}
	
	
	
	
	
	
}
