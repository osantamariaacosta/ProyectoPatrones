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
	
	 public ArrayList<Departament> listarUser() throws Exception 
	 {
	        ArrayList<Departament> lista = new ArrayList<>();

	        String query;
	        query = "SELECT * FROM TDepartament";

	        try {
	        	
	            AccesoBD accesoDatos;
	            accesoDatos = Conector.getConector();
	            ResultSet rs = accesoDatos.ejecutarSQL(query);
	            while (rs.next()) {
	                Departament tmpDepartament = new Departament();

	                tmpDepartament.setName(rs.getString("name"));
	                tmpDepartament.setId(rs.getString("lastName"));
	                tmpDepartament.setDescription(rs.getInt("id"));
	                tmpDepartament.setCompanyId(rs.getString("company"));
	        	return lista;
	        } catch (Exception error) {
	            System.out.println(error);
	            System.out.println(error.getMessage());
				return lista;
	        }

	    }
	

}
