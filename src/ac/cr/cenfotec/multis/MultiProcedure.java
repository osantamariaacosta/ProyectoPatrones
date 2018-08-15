package ac.cr.cenfotec.multis;
import java.sql.ResultSet;

import java.util.ArrayList;

import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.clases.Task;
import com.cenfotec.AccesoDatos.*; 

public class MultiProcedure {
	
	public boolean registerProcedure ( Procedure newProcedure ) {
		
		
		String query;
		query = "INSERT INTO TProcedure (name, companyId, description) VALUES ('" + 
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
			// System.out.print("Error located in MultiProcedure");
			// System.out.println(error);
			// System.out.println(error.getMessage());
			return true;
		}
	}
	
	public Procedure findProcedureByName (String name) 
	{
		Procedure searchedProcedure = new Procedure ();

		String select  = "SELECT * FROM TProcedure WHERE name=" + "'" + name + "'";

		
		try  (ResultSet rs = Conector.getConector().getDatosSQL(select)) {
			while (rs.next()) {
				searchedProcedure = new Procedure(rs.getString("name"), rs.getString("companyId"), rs.getString("description"));
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
		
		String select  = "SELECT * FROM TProcedure";

		
		try  (ResultSet rs = Conector.getConector().getDatosSQL(select)) {
			while (rs.next()) {
				procedures.add(searchedProcedure = new Procedure(rs.getString("name"), rs.getString("companyId"), rs.getString("description")));
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
		query = "INSERT INTO Ttask (id, name, idUsuario, procedureName,  description, state) VALUES ('" + 
				task.getId() + "','" + 
				task.getName() + "','" + 
				task.getIdUsuario() + "','" + 
				task.getProcedureName() + "','" + 
				task.getDescription() + "','" + 
				task.getState() + "')";
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
			
		}catch (Exception error) {

			return true;
		}
	}
	
	
	public boolean assingTask (	String idUsuario, int idTaks ) {
		
		String query;
		query = "UPDATE Ttask SET idUsuario= '"+ idUsuario +"' " + "WHERE id=" + idTaks;
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
			
		}catch (Exception error) {

			return true;
		}
	}	
	
	
	
	public ArrayList<Task> getRegisteredTasks () 
	{
		ArrayList<Task> tasks = new ArrayList<>(); 
		Task searchedTask = new Task ();
		
		String select  = "SELECT * FROM Ttask";

		
		try  (ResultSet rs = Conector.getConector().getDatosSQL(select)) {
			while (rs.next()) {
				tasks.add(searchedTask = new Task(
						rs.getInt("id"),
						 rs.getString("name"),
						rs.getString("idUsuario"),
						rs.getString("procedureName"),
						rs.getString("description"),
						rs.getInt("state")));
			}
			
			rs.close();
			return tasks;
		} catch (Exception error) {
			System.out.println("Error located in MultiProcedure getRegisteredTasks");
			System.out.println(error);
			System.out.println(error.getMessage());
			return tasks;
		}
		
	}
	
	
	public ArrayList<Task> listarTareasAsignadas ( int id ) 
	{
		ArrayList<Task> tasks = new ArrayList<>(); 
		Task searchedTask = new Task ();
		
		String select  = "SELECT * FROM Ttask WHERE idUsuario=" + "'" + id  + "'";

		
		try  (ResultSet rs = Conector.getConector().getDatosSQL(select)) {
			while (rs.next()) {
				tasks.add(searchedTask = new Task(
						rs.getInt("id"),
						 rs.getString("name"),
						rs.getString("idUsuario"),
						rs.getString("procedureName"),
						rs.getString("description"),
						rs.getInt("state")));
			}
			
			rs.close();
			return tasks;
		} catch (Exception error) {
			System.out.println("Error located in MultiProcedure getRegisteredTasks");
			System.out.println(error);
			System.out.println(error.getMessage());
			return tasks;
		}
		
	}	
	
	
	
}
