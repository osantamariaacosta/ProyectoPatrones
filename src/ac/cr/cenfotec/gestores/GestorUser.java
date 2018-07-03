package ac.cr.cenfotec.gestores;

import ac.cr.cenfotec.multis.*;
import java.util.ArrayList;
import ac.cr.cenfotec.clases.Employee;
import java.sql.SQLException;

public class GestorUser {
	Multi_User multi = new Multi_User();

	public boolean registerEmployee(String name, String lastName, int id, String password, String userName, int userType) 
			throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception
	{	
		boolean isRegistered;
		
	    isRegistered = multi.registerEmployee(name, lastName, id, password, userName, userType);
	    
	    return isRegistered;
	}
	
	public ArrayList<Employee> listarEmpleado() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception 
	{
	    ArrayList<Employee> lista;
	    lista = multi.listarEmpleado();
	    return lista;
	}
}
