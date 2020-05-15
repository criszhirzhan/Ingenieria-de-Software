package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ec.edu.ups.modelo.Libro;

public class Controlador {
private List librosRec;
private String usu;
private String contra;

public Controlador() {
	librosRec =new  ArrayList<Libro>();
}

public void pruebaINsert(int op) {
	if(op==1) {
		
		Scanner c=new Scanner(System.in);
		System.out.println("Bienbenido al sistema de Login \n -------------------------------");
		System.out.println("Ingrese su correo :V ");
		usu=c.nextLine();
		System.out.println("Ingrese su contrasenia :");
		contra=c.nextLine();
		
	}
}
	public void recuperarLibros(int op) {
			if(op==1) {
				System.out.println("Impriminos la lista de todos los libros disponibles");
				
			}
	}
	
	
}
