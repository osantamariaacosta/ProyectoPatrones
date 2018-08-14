package ac.cr.cenfotec.gestores;

import ac.cr.cenfotec.multis.*;
import java.util.ArrayList;
import ac.cr.cenfotec.clases.Employee;
import ac.cr.cenfotec.clases.User;

import java.sql.SQLException;

public class GestorUser {
	Multi_User multi = new Multi_User();

	public boolean  registerUser(String name, String lastName, int id, String password, String userName, int userType, String firm, String company, String departament) 
			throws Exception
	{	
		boolean isRegistered;
		try {
		
			isRegistered = multi.registerUser(name, lastName, id, password, userName, userType, firm, company, departament);
			return isRegistered;
			
		} catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			isRegistered = false;
			return true;
		}
	}
	
	public ArrayList<User> listarEmpleado() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception 
	{
	    ArrayList<User> lista = new ArrayList<>();
	    // lista = multi.listarUser();
	    return lista;
	}
}
