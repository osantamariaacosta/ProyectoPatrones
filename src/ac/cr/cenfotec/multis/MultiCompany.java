package ac.cr.cenfotec.multis;

import ac.cr.cenfotec.clases.Company;

import com.cenfotec.AccesoDatos.*; 
import java.sql.ResultSet;
import java.util.ArrayList;

import ac.cr.cenfotec.clases.Employee;
import ac.cr.cenfotec.clases.Procedure;


public class MultiCompany {
	public boolean registerCompany(String legalNumber, String name, String description)
	{
		
		String query;
		query = "Insert Into TCompany (legalNumber, name, description) VALUES ('" + legalNumber + "','" + name + "','"
				+ description + "')";
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
		}catch (Exception error) {

			return true;
		}
	}
	
	 public ArrayList<Company> listarCompania() throws Exception 
	 {
	        ArrayList<Company> lista = new ArrayList<>();
	        Company searchedCompany = new Company ();

	        String query;
	        query = "SELECT * FROM TCompany";


	            
    		try  (ResultSet rs = Conector.getConector().getDatosSQL(query)) {
    			while (rs.next()) {
    				lista.add(searchedCompany = new Company(rs.getString("legalNumber"), rs.getString("name"), rs.getString("description")));
    			}
    			
    			rs.close();
    			return lista; 
	        } catch (Exception error) {
	            System.out.println(error);
	            System.out.println(error.getMessage());
				return lista;
	        }

	    
	 }

}
