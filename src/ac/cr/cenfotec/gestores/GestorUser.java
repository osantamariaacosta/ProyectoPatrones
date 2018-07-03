package ac.cr.cenfotec.gestores;

import ac.cr.cenfotec.multis.*;
import java.util.ArrayList;
import ac.cr.cenfotec.clases.Employee;
import java.sql.SQLException;

public class GestorUser {
	Multi_User multi = new Multi_User();

	public boolean  registerEmployee(String name, String lastName, int id, String password, String userName, int userType) 
			throws Exception
	{	
		boolean isRegistered;
		try {
		
			isRegistered = multi.registerEmployee(name, lastName, id, password, userName, userType);
			return isRegistered;
			
		} catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			isRegistered = false;
			return false;
		}
	}
	
	public ArrayList<Employee> listarEmpleado() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception 
	{
	    ArrayList<Employee> lista;
	    lista = multi.listarEmpleado();
	    return lista;
	}
}
