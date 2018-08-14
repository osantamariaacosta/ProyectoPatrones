package ac.cr.cenfotec.multis;

import ac.cr.cenfotec.clases.Company;
import com.cenfotec.AccesoDatos.*; 
import java.sql.ResultSet;
import java.util.ArrayList;

import ac.cr.cenfotec.clases.Employee;


public class MultiCompany {
	public boolean registerCompany(String legalNumber, String name, int description)
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
	
	 public ArrayList<Company> listarCompania() throws Exception 
	 {
	        ArrayList<Company> lista = new ArrayList<>();

	        String query;
	        query = "SELECT * FROM TCompany";

	        try {
	        	
	           /* AccesoBD accesoDatos;
	            accesoDatos = Conector.getConector();
	            ResultSet rs = accesoDatos.ejecutarSQL(query);
	            while (rs.next()) {
	                Employee tmpEmpleado = new Employee();

	                tmpCompany.setLeaglNumber(rs.getString("legalNumber"));
	                tmpCompany.setName(rs.getString("name"));
	                tmpCompany.setDescription(rs.getInt("description")); }*/
	               
	        	return lista;
	        } catch (Exception error) {
	            System.out.println(error);
	            System.out.println(error.getMessage());
				return lista;
	        }

	    
	 }

}
