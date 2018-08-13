package ac.cr.cenfotec.multis;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.ResultSet;

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
	
	public Procedure findProcedureById (int id) 
	{
		Procedure searchedProcedure = new Procedure ();
		Boolean ejex = true;
		String select  =  "SELECT NOMBRE,APELLIDO,TELEFONO,CEDULA,DIRECCION FROM TPERSONA WHERE CEDULA =\" + \"'\" + pID + \"'\"";

		/* 		this.name = name;
		this.id = id;
		this.companyId = companyId;
		this.description = description;*/
		
		try  (ResultSet rs = Conector.getConector().ejecutarSQL(select, ejex)) {
			while (rs.next()) {
				// searchedProcedure = new Procedure(rs.getString("NOMBRE"), rs.getInt("ID"), rs.getInt("COMPANYID"), rs.getString("DESCRIPTION"));
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
