package ec.edu.ups.modelo;

import java.util.Date;

public class Cliente {
private int idCliente;
private String nombre;
private String apellido;
private String cedula;
private int edad;
private Date fechaNac;
private double credito;

public void recargaCredito() {
}


public Cliente() {
	
}

public Cliente(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNac, double credito) {
	super();
	this.idCliente = idCliente;
	this.nombre = nombre;
	this.apellido = apellido;
	this.cedula = cedula;
	this.edad = edad;
	this.fechaNac = fechaNac;
	this.credito = credito;
}




public int getIdCliente() {
	return idCliente;
}

public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public Date getFechaNac() {
	return fechaNac;
}

public void setFechaNac(Date fechaNac) {
	this.fechaNac = fechaNac;
}

public double getCredito() {
	return credito;
}

public void setCredito(double credito) {
	this.credito = credito;
}

@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
			+ ", edad=" + edad + ", fechaNac=" + fechaNac + ", credito=" + credito + "]";
}
	


}
