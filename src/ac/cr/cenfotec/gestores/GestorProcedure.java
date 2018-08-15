package ac.cr.cenfotec.gestores;

import java.util.ArrayList;
import java.util.Optional;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.clases.Task;
import ac.cr.cenfotec.components.GestorAbstract;
import ac.cr.cenfotec.multis.MultiProcedure;

public class GestorProcedure extends GestorAbstract {
	
	MultiProcedure multiProcedure = new MultiProcedure();

	public boolean registerProcedure (String name, String companyId, String description) throws Exception 
	{
		boolean stateProcess = false; 
		try {
			
			Procedure newProcedure = new Procedure (name, companyId, description);
			stateProcess = multiProcedure.registerProcedure(newProcedure);
			return stateProcess;
		
		} catch (Exception error) {
			System.out.print("Error located in GestorProcedure. Method: registerProcedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return stateProcess;
		}
	}
	
	
	public boolean assingTask (	String idUsuario, int idTaks ) 
	{
		boolean stateProcess = false; 
		try {
			
			stateProcess = multiProcedure.assingTask(idUsuario, idTaks);
			return stateProcess;
		
		} catch (Exception error) {

			return stateProcess;
		}
	}
	
	
	public Optional<Procedure> searchProcedureById (String name) throws Exception {
		
		Procedure found = new Procedure();
		try 
		{
			found = multiProcedure.findProcedureByName(name);
			if (found == null)
			{
				return Optional.empty();
			}
			
		} catch (Exception error) {
			System.out.println("Error located in GestorProcedure. Method: searchProcedureById");
			System.out.println(error);
			System.out.print(error.getMessage());
		}
		
		return Optional.of(found);
	} 
	
	public boolean addTask (int id, String name, String idUsuario, String nameProcedure, String description, int state) {
		boolean stateProcess = false; 
		try {
			
			Task newTask = new Task ( id, name, idUsuario, nameProcedure, description, state);
			stateProcess = multiProcedure.addTask(newTask);
			return stateProcess;
		
		} catch (Exception error) {
			System.out.print("Error located in GestorProcedure. Method: addTask to procedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return stateProcess;
		}
	}
	
	public boolean removeTask (int taksId)
	{
		return true;
	}
	
	public ArrayList<Procedure> getRegisteredProcedures() 
	{
	    ArrayList<Procedure> lista;
	    lista = multiProcedure.getRegisteredProcedures();
	    return lista;
	}
	
	public ArrayList<Task> getResgisteredTasks() 
	{
	    ArrayList<Task> lista;
	    lista = multiProcedure.getRegisteredTasks();
	    return lista;
	}
	
	public ArrayList<Task> listarTareasAsignadas(int id) 
	{
	    ArrayList<Task> lista;
	    lista = multiProcedure.listarTareasAsignadas(id);
	    return lista;
	}
	
	/*
	public boolean updateProcedure() 
	{
		
	} */
	// preguntar cómo se debería actualizar un proceso o si esa funcionalidad no es necesaria
	
	public boolean deleteProcedure(int procedureId) 
	{
		return true;
	}
	
}
