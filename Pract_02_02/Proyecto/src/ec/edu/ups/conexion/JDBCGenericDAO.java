package ec.edu.ups.conexion;

import java.util.List;

import ec.edu.upd.dao.GenericDAO;


public abstract class JDBCGenericDAO <T,ID> implements GenericDAO<T, ID>{
	protected ContextJDBC conexionUno = ContextJDBC.getJDBC1();
	protected ContextJDBC conexionDos = ContextJDBC.getJDBC2();

}
