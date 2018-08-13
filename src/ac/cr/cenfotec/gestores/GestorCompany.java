package ac.cr.cenfotec.gestores;

import java.util.ArrayList;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.multis.MultiCompany;


public class GestorCompany {
	MultiCompany multi = new MultiCompany();

	public boolean  registerUser(String legalNumber, String name, int description) 
			throws Exception
	{	
		boolean isRegistered;
		try {
		
			isRegistered = multi.registerCompany(legalNumber, name, description);
			return isRegistered;
			
		} catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			isRegistered = false;
			return false;
		}
	}
	
	public ArrayList<Company> listarCompania() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception 
	{
	    ArrayList<Company> lista;
	    lista = multi.listarCompania();
	    return lista;
	}
}
