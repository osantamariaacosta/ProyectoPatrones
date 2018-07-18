package ac.cr.cenfotec.gestores;

import java.util.ArrayList;

import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.multis.MultiProcedure;

public class GestorProcedure {
	
	MultiProcedure multiProcedure = new MultiProcedure();

	public boolean registerProcedure (String name, int id, int companyId, String description) throws Exception 
	{
		boolean stateProcess = false; 
		try {
			
			Procedure newProcedure = new Procedure (name, id, companyId, description);
			stateProcess = multiProcedure.registerProcedure(newProcedure);
			return stateProcess;
		
		} catch (Exception error) {
			System.out.print("Error located in GestorProcedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return stateProcess;
		}
	}
	
	public boolean updateProcedure (int id) {
		return true;
	} 
	
	public boolean addTask (int procedureId, String description, int state) {
		return true;
	}
	
	public boolean removeTask (int taksId)
	{
		return true;
	}
	
	public ArrayList<Procedure> getRegisteredProcedures() 
	{
		return new ArrayList<Procedure>();
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
