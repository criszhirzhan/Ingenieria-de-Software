package ec.edu.ups.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
		String url = "jdbc:mysql://localhost:3306/libros";
		String user = "root";
		String pass = "Phone5ss";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, pass);
			sentencia = conexion.createStatement();
		}catch (ClassNotFoundException e) {
		System.out.println("imposible cargar el driver: " + e.getMessage());
		}

		try {
			sentencia.executeUpdate("INSERT cliente (cli_cedula, cli_nombres, cli_apellidos,cli_correo) VALUES ('0151928979','Cris','Zhirzhan','cris@gmail.com')");

		}catch(SQLException e){
			System.out.println("Fallo ingreso datos: " + e.getMessage());
		}
		try {
			result = sentencia.executeQuery("SELECT * FROM cliente");
			while(result.next()) 
				System.out.println("id:" + result.getLong("cli_id") +", nombre: " + result.getString("cli_nombres"));
		}catch (SQLException e) {
			System.out.println("Consulta fallida: "+e.getMessage());
		}

		

	}

}
