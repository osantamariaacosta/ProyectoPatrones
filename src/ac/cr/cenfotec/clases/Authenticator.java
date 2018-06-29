/**
 * 
 */
package ac.cr.cenfotec.clases;

import java.util.ArrayList;

public class Authenticator {
	private int userState = 1;
	private String authenticatorMensaje;
	private ArrayList<User> usersList = new ArrayList<User>();
	private boolean authenticated;
	
	
	public boolean validateCredencials (String userName, String password) {
		boolean authenticated = false;
		ArrayList<User> userList = getRegiteredUsers();
		
		try {
			for (int i = 0; i < userList.size(); i++) {
				String currentUserName = userList.get(i).getUserName();
				String currentUserPassword = userList.get(i).getPassword();
				if (currentUserName.equals(userName) && currentUserPassword.equals(password)) {
					authenticated = true;
					authenticatorMensaje = "usuario autenticado";
					userState = 0;
				} 
			} 
		}
		catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
		}
		
		return authenticated;
	}
	
	public ArrayList<User> getRegiteredUsers () {
		ArrayList<User> adminList = new ArrayList<User>();
		User newAdmin = new User("Eduardo","Martinez", 01, "abc123", "eduMar", 0);
		User newEmployee = new User("Carlos","Garro", 02, "abc123", "carGa", 1);
		adminList.add(newAdmin);
		adminList.add(newEmployee);
		return adminList;
	}
	
	
	
	/**
	 * @return the authenticated
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * @param authenticated the authenticated to set
	 */
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	/**
	 * @return the userState
	 */
	public int getUserState() {
		return userState;
	}
	/**
	 * @param userState the userState to set
	 */
	public void setUserState(int userState) {
		this.userState = userState;
	}
	/**
	 * @return the authenticatorMensaje
	 */
	public String getAuthenticatorMensaje() {
		return authenticatorMensaje;
	}
	/**
	 * @param authenticatorMensaje the authenticatorMensaje to set
	 */
	public void setAuthenticatorMensaje(String authenticatorMensaje) {
		this.authenticatorMensaje = authenticatorMensaje;
	}
	/**
	 * @return the usersList
	 */
	public ArrayList<User> getUsersList() {
		return usersList;
	}
	/**
	 * @param usersList the usersList to set
	 */
	public void setUsersList(ArrayList<User> usersList) {
		this.usersList = usersList;
	}
	
	
	

}


