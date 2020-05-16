package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
private int idCliente;
private String nombre;
private String apellido;
private String cedula;
private double credito;

public double recargaCredito(double valor) {
	
	return valor+getCredito();
}


public Cliente() {
	
}


public Cliente(int idCliente, String nombre, String apellido, String cedula, double credito) {
	super();
	this.idCliente = idCliente;
	this.nombre = nombre;
	this.apellido = apellido;
	this.cedula = cedula;
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


public double getCredito() {
	return credito;
}


public void setCredito(double credito) {
	this.credito = credito;
}


@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
			+ ", credito=" + credito + "]";
}




}