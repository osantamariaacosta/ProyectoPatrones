package ac.cr.cenfotec.gestores;

import ac.cr.cenfotec.multis.*;
import java.util.ArrayList;
import ac.cr.cenfotec.clases.Employee;

public class GestorUser {

	public void registerEmployee(String name, String lastName, int id, String password, String userName, int userType) throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception{
		
		 	Multi_User multi;
	        multi = new Multi_User();
	        multi.registerEmployee(name, lastName, id, password, userName, userType);
	}
	
	  public ArrayList<Employee> listarEmpleado() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception {

	        ArrayList<Employee> lista;

	        Multi_User multi;
	        multi = new Multi_User();
	        lista = multi.listarEmpleado();

	        return lista;
	    }
}
