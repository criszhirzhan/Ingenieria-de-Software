package ec.edu.ups.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sun.net.www.content.text.Generic;

public class Conexion{
	
	
	public  Conexion() {
		
	}
	
	
	public Statement conexionB() throws SQLException  {
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

		return sentencia;
		
	}
	
	

	
	


	
}
