package ac.cr.cenfotec.gestores;

import ac.cr.cenfotec.multis.*;

public class GestorUser {

	public void registerEmployee(String name, String lastName, int id, String password, String userName, int userType) throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception{
		
		 	Multi_User multi;
	        multi = new Multi_User();
	        multi.registerEmployee(name, lastName, id, password, userName, userType);
	}
}
