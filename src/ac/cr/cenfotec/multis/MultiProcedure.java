package ac.cr.cenfotec.multis;

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
			System.out.print("Error located in MultiProcedure");
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}
	
}
