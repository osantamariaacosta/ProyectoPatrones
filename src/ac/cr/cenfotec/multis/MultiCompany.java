package ac.cr.cenfotec.multis;

import ac.cr.cenfotec.clases.User;
import accesoDatos.AccesoBD;
import accesoDatos.Conector;
import ac.cr.cenfotec.clases.Employee;


public class MultiCompany {
	public boolean registrarCompania(String legalNumber, String name, int description)
	{
		
		String query;
		query = "Insert Into Company (legalNumber, name, description) VALUES ('" + legalNumber + "','" + name + "','"
				+ description + "')";
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
		}catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}
	

}
