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
		
		//Ingresando Libros Digitales
		LibroDigital ld = new LibroDigital(21,"Origen", "Dan Brown", "2", 20.56);
		LibroDigital ld2 = new LibroDigital(22,"Harry Potter", "J.K. Rowling", "1", 60.99);
		
		//Ingresando Libros Impresos
		libroImpreso li = new libroImpreso(40,"El Alquimista", "Paulo Coelho", "2", 70.99,14);
		
		
		
		
		
		//calculando fecha pedido
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		
		
		//realizando compra, calculo de percios totales y comisiones.
		ld.setCosto(ld.calcularPrecioTotal());
		li.setCosto(li.calcularPrecioTotal());
		li.setStock(li.getStock()-cantLibImpresos);
		
		System.out.println("Costo total: "+ld.getCosto());
		
		//Debito del cliente
		cliente.setCredito(ld.debitoCredito(cliente.getCredito()));
		cliente.setCredito(li.debitoCredito(cliente.getCredito()));
		
		
		
		//Se crean las listas de libros adquiridos.
		List<LibroDigital> lisDb = new ArrayList<LibroDigital>();
		List<libroImpreso> lisIb = new ArrayList<libroImpreso>();
		lisDb.add(ld);
		lisIb.add(li);
		
		
		
		
		
		
		//Se crea el pedido 
		
		Pedido pedido1 = new Pedido();
		pedido1.setIdPedido(30);
		pedido1.setIdCliente(cliente.getIdCliente());
		pedido1.setFechaPedido(dateFormat.format(date));
		pedido1.setLibroDigital(lisDb);
		pedido1.setLibrosImpresos(lisIb);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido1);
		
		//Se añade al carrito
		Carrito carrito = new Carrito(50, cliente.getIdCliente(), pedidos);
		
		
		//Lista Libros Adquiridos
		carrito.listarPedido();

	}

}
