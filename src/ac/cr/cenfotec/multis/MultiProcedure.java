package ac.cr.cenfotec.multis;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.ResultSet;
import java.util.ArrayList;

import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.clases.Task;
import accesoDatos.AccesoBD;
import accesoDatos.Conector;

public class MultiProcedure {
	
	public boolean registerProcedure ( Procedure newProcedure ) {
		
		
		String query;
		query = "INSERT INTO Procedure (name, companyId, description) VALUES ('" + 
				newProcedure.getName() + "','" + 
				newProcedure.getCompanyId() + "','" + 
				newProcedure.getDescription() + "')";
		
		// name, id, companyId, description
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
			
		}catch (Exception error) {
			System.out.print("Error located in MultiProcedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public Procedure findProcedureByName (String name) 
	{
		Procedure searchedProcedure = new Procedure ();
		Boolean ejex = true;

		String select  = "SELECT * FROM TProcedure WHERE name=" + "'" + name + "'";

		
		try  (ResultSet rs = Conector.getConector().ejecutarSQL(select, ejex)) {
			while (rs.next()) {
				searchedProcedure = new Procedure(rs.getString("name"), rs.getInt("companyId"), rs.getString("description"));
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
	
	public ArrayList<Procedure> getRegisteredProcedures () 
	{
		ArrayList<Procedure> procedures = new ArrayList<>(); 
		Procedure searchedProcedure = new Procedure ();
		Boolean ejex = true;

		String select  = "SELECT * FROM TProcedure";

		
		try  (ResultSet rs = Conector.getConector().ejecutarSQL(select, ejex)) {
			while (rs.next()) {
				procedures.add(searchedProcedure = new Procedure(rs.getString("name"), rs.getInt("companyId"), rs.getString("description")));
			}
			
			rs.close();
			return procedures;
		} catch (Exception error) {
			System.out.println("Error located in MultiProcedure FinProcedureById");
			System.out.println(error);
			System.out.println(error.getMessage());
			return procedures;
		}
		
	}	
	
	public boolean addTask ( Task task ) {
		
		String query;
		query = "INSERT INTO Procedure (name, id, companyId, description) VALUES ('" + 
				task.getName() + "','" + 
				task.getId() + "','" + 
				task.getProcedureId() + "','" + 
				task.getState() + "','" + 
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
