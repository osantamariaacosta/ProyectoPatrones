package ac.cr.cenfotec.multis;

import java.sql.ResultSet;

import ac.cr.cenfotec.clases.Procedure;

public class MultiProcedure {
	
	public boolean registerProcedure ( Procedure newProcedure ) {
		
		String query;
		query = "INSERT INTO Procedure (name, id, companyId, description) VALUES ('" + 
				newProcedure.getName() + "','" + 
				newProcedure.getId() + "','" + 
				newProcedure.getCompanyId() + "','" + 
				newProcedure.getDescription() + "')";
		
		// name, id, companyId, description
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
			
		}catch (Exception error) {
			System.out.print("Error located in MultiProcedure MultiProcedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public Procedure findProcedureById (int id) 
	{
		Procedure searchedProcedure = new Procedure ();
		String select  =  "SELECT NOMBRE,APELLIDO,TELEFONO,CEDULA,DIRECCION FROM TPERSONA WHERE CEDULA =\" + \"'\" + pID + \"'\"";

		try  (ResultSet rs = Conector.getConector().getDatosSQL(select)) {
			while (rs.next()) {
				searchedProcedure = new Procedure();
			}
			
			rs.close();
			return searchedProcedure;
		} catch (Exception error) {
			System.out.println("Error located in MultiProcedure FinProcedureById");
			System.out.println(error);
			System.out.println(error.getMessage());
		}
		
		return searchedProcedure; 
	}
	
	public boolean addTask ( Task task ) {
		
		String query;
		query = "INSERT INTO Procedure (name, id, companyId, description) VALUES ('" + 
				task.getName() + "','" + 
				task.getId() + "','" + 
				task.getCompanyId() + "','" + 
				task.getDescription() + "')";
		
		// name, id, companyId, description
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
			
		}catch (Exception error) {
			System.out.print("Error located in MultiProcedure addTask");
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}	
	
	
}
