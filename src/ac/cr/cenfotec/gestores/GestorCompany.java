package ac.cr.cenfotec.gestores;

import java.util.ArrayList;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.components.GestorAbstract;
import ac.cr.cenfotec.multis.MultiCompany;


public class GestorCompany extends GestorAbstract {
	MultiCompany multi = new MultiCompany();

	public boolean  registerCompany(String legalNumber, String name, String description) 
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
			return true;
		}
	}
	
	public ArrayList<Company> listarCompania() throws java.lang.ClassNotFoundException, java.sql.SQLException, Exception 
	{
	    ArrayList<Company> lista;
	    lista = multi.listarCompania();
	    return lista;
	}
}
