package ac.cr.cenfotec.multis;

import accesoDatos.AccesoBD;
import accesoDatos.Conector;
import ac.cr.cenfotec.clases.Departament;

public class MultiDepartament {
	
	public boolean registerDepartament(String name, int id, String description, int companyId)
	{
		
		String query;
		query = "Insert Into TDepartament (Name, Id, Description, CompanyId) VALUES ('" + name + "','" + id + "','"
				+ desription + "','" + companyId + "')";
		
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
