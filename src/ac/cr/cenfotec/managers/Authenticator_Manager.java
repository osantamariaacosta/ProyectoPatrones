/**
 * 
 */
package ac.cr.cenfotec.managers;
import ac.cr.cenfotec.clases.Authenticator;
import ac.cr.cenfotec.clases.UserAuthenticated;;


public class Authenticator_Manager {
	private Authenticator authenticator = new Authenticator();
	private UserAuthenticated userAuthenticated = new UserAuthenticated();
	
	public boolean validateCredentials (String userName, String password) throws Exception {
		boolean isAuthenticated = false;
		isAuthenticated = authenticator.validateCredencials(userName, password);
		return false;
	}
}
