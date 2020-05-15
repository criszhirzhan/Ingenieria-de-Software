package ec.edu.ups.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.modelo.LibroDigital;
import javafx.scene.transform.Scale;

public class Main {


	public static void main(String[] args) throws SQLException {
		Scanner entrada=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Bienbenido a la biblioteca virtual");
		System.out.println("Ingrese: \n1.Para Listar libros \n2.Para Logearce");
		//String opt= entrada.nextLine();
		
		
		Connection conexion =null;
		Statement sentencia = null;
		ResultSet result = null;
		
		Conexion con = new Conexion();
		
		sentencia=con.conexionB();
		
		sentencia.executeUpdate("INSERT cliente (cli_cedula, cli_nombres, cli_apellidos,cli_correo,cli_credito) VALUES ('0151928908','Juan','Perez','juan@gmail.com', 90.21)");
		
		
	
	
	}

}
