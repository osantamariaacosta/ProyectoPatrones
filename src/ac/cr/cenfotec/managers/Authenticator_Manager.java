/**
 * 
 */
package ac.cr.cenfotec.managers;
import java.util.ArrayList;

import ac.cr.cenfotec.clases.Authenticator;
import ac.cr.cenfotec.clases.User;
import ac.cr.cenfotec.clases.UserAuthenticated;
import ac.cr.cenfotec.multis.Multi_User;


public class Authenticator_Manager {
	private Authenticator authenticator = new Authenticator();
	private UserAuthenticated userAuthenticated = new UserAuthenticated();
	private ArrayList<User> usersList = new ArrayList<User>();
	private Multi_User multiUser = new Multi_User();
	
	public boolean validateCredentials (String userName, String password) throws Exception 
	{
		
		boolean isAuthenticated = false;
		
		try {
			
			this.usersList = this.getUsers();
			isAuthenticated = this.authenticator.validateCredencials(userName, password, usersList);		
			this.setUserAuthenticated(isAuthenticated, userName);
			
		} catch (Exception error) {
			
			System.out.println(error);
			System.out.println(error.getMessage());
			
		}

		return isAuthenticated;
	}
	
	public UserAuthenticated getUserAutenticated () 
	{
		return this.userAuthenticated;
	}
	
	private void setUserAuthenticated (boolean isAuthenticated, String userName) throws Exception
	{
		User currentUser = new User();
		
		try {
			
			if (isAuthenticated) {
				
				currentUser = multiUser.getUserByUserName(userName);
				if (currentUser != null) {
					userAuthenticated = new UserAuthenticated(
							currentUser.getName(), 
							currentUser.getLastName(), currentUser.getId(), 
							currentUser.getUserName(), currentUser.getUserType());				
				} else {
					userAuthenticated = null;
				}
				
			}
			
		} catch (Exception error) {
			
			System.out.println(error);
			System.out.println(error.getMessage());
			
		}
		
	}
	
	public ArrayList<User> getUsers () {
		ArrayList<User> adminList = new ArrayList<User>();
		User newAdmin = new User("Eduardo","Martinez", 01, "abc123", "eduMar", 0);
		User newEmployee = new User("Carlos","Garro", 02, "abc123", "carGa", 1);
		adminList.add(newAdmin);
		adminList.add(newEmployee);
		return adminList;
	}	
}
