package ec.edu.ups.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.modelo.Carrito;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.LibroDigital;
import ec.edu.ups.modelo.Pedido;
import ec.edu.ups.modelo.libroImpreso;
import javafx.scene.transform.Scale;

public class Main {


	public static void main(String[] args) throws SQLException {
		
		//Cantidad de libros 
		int cantLibImpresos = 1;
		

		//Libros
		
		//Ingresando Clientes
		Cliente cliente = new Cliente (1, "Juan", "Perez", "0981726495", 300.90);
		
		//Ingresando Clientes (Segundo Cliente)
		Cliente cliente1 = new Cliente (2, "Pablo", "Martinez", "098345495", 200);
				
		
		//Ingresando Libros Digitales
		LibroDigital ld = new LibroDigital(21,"Origen", "Dan Brown", "2", 20.56);
		LibroDigital ld2 = new LibroDigital(22,"Harry Potter", "J.K. Rowling", "1", 60.99);
		LibroDigital ld3 = new LibroDigital(23,"P.Arriba", "Maria Fernanda Heredia", "2",13.15);
		LibroDigital ld4 = new LibroDigital(24,"quesevan", "Demetrio Aguilera Malta", "1",7.00);
		LibroDigital ld5 = new LibroDigital(25,"Cien anios de soledad", "Ganriel Garcia Marquez", "1",18.60);
		
		//Ingresando Libros Impresos
		libroImpreso li = new libroImpreso(40,"El Alquimista", "Paulo Coelho", "2", 70.99,14);
		libroImpreso li2 = new libroImpreso(41, "Homero", "Illiada","1", 54.18,9);
		libroImpreso li3 = new libroImpreso(42, "Romeo y Julieta", "William Shakespeare","2", 14.75,20);
		libroImpreso li4 = new libroImpreso(43, "Frankestein", "Mary W. Shelly","1", 7.25,30);
		libroImpreso li5 = new libroImpreso(41, "Don quijote de la mancha", "Miguel de Cervantes","3", 22.50,18);
		
		
		
		
		//calculando fecha pedido
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		
		
		//realizando compra, calculo de percios totales y comisiones.
		ld.setCosto(ld.calcularPrecioTotal());
		li.setCosto(li.calcularPrecioTotal());
		li.setStock(li.getStock()-cantLibImpresos);
		
		
		
		//realizando compra, calculo de percios totales y comisiones.
				ld2.setCosto(ld2.calcularPrecioTotal());
				li2.setCosto(li2.calcularPrecioTotal());
				li2.setStock(li2.getStock()-cantLibImpresos);
				
			//	System.out.println("Costo total: "+ld2.getCosto());
				
				
		//Debito del cliente
		cliente.setCredito(ld.debitoCredito(cliente.getCredito()));
		cliente.setCredito(li.debitoCredito(cliente.getCredito()));
		
		//Debito del cliente numero (cliente 2)
				cliente1.setCredito(ld2.debitoCredito(cliente1.getCredito()));
				cliente1.setCredito(li2.debitoCredito(cliente1.getCredito()));
		
		
		
		//Se crean las listas de libros adquiridos.
		List<LibroDigital> lisDb = new ArrayList<LibroDigital>();
		List<libroImpreso> lisIb = new ArrayList<libroImpreso>();
		lisDb.add(ld);
		lisIb.add(li);
		
		//Se cran la slistas de los libros adquiridos (pedido 2)
		List<LibroDigital> lisDb1 = new ArrayList<LibroDigital>();
		List<libroImpreso> lisIb1 = new ArrayList<libroImpreso>();
		lisDb1.add(ld2);
		lisIb1.add(li2);
		
		
		
		
		
		
		
		//Se crea el pedido 
		
		Pedido pedido1 = new Pedido();
		pedido1.setIdPedido(30);
		pedido1.setIdCliente(cliente.getIdCliente());
		pedido1.setFechaPedido(dateFormat.format(date));
		pedido1.setLibroDigital(lisDb);
		pedido1.setLibrosImpresos(lisIb);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido1);
		
		// Creamos el segundo pedido (cliente 2)
		Pedido pedido2 = new Pedido();
		pedido2.setIdPedido(31);
		pedido2.setIdCliente(cliente1.getIdCliente());
		pedido2.setFechaPedido(dateFormat.format(date));
		pedido2.setLibroDigital(lisDb1);
		pedido2.setLibrosImpresos(lisIb1);
		
		List<Pedido> pedidos1 = new ArrayList<Pedido>();
		pedidos1.add(pedido2);
		
		
		//Se añade al carrito
		Carrito carrito = new Carrito(50, cliente.getIdCliente(), pedidos);
		
		//Se añade al carrito(cliente 3)
		Carrito carrito1 = new Carrito(51, cliente1.getIdCliente(), pedidos1);
		
		List<Cliente> cli=new ArrayList<Cliente>();
		cli.add(cliente);
		cli.add(cliente1);
				System.out.println("Datos Cliente numero 1 :" +cli.get(0));
		
		//Lista Libros Adquiridos
		carrito.listarPedido();
		
		System.out.println(" ");
		System.out.println("--------------------------------------------------"
				+ "-------------------------------------------------------------"
				+ "----------------");
		System.out.println(" ");
		
		System.out.println("Datos cliente numero 2 :" +cli.get(1));
		//Lista Libros Adquiridos(pedido 2)
		carrito1.listarPedido();
				
	
	}

}
