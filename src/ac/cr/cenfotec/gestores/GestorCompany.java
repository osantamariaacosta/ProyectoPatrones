package ac.cr.cenfotec.gestores;

public class GestorCompany {

	public boolean  registerUser(String legalNumber, String name, int description) 
			throws Exception
	{	
		boolean isRegistered;
		try {
		
			isRegistered = multi.registerUser(legalNumber, name, description);
			return isRegistered;
			
		} catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			isRegistered = false;
			return false;
		}
	}
}
