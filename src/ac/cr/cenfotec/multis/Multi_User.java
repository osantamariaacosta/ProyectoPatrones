/**
 * 
 */
package ac.cr.cenfotec.multis;
import java.util.ArrayList;

import ac.cr.cenfotec.clases.User;

public class Multi_User {

	
	public ArrayList<User> getUsers () {
		ArrayList<User> userList = new ArrayList<User>();
		User newUser = new User("Eduardo","Martinez", 01, "abc123", "eduMar", 0);
		User newEmployee = new User("Carlos","Garro", 02, "abc123", "carGa", 1);
		userList.add(newUser);
		userList.add(newEmployee);
		return userList;
	}	
	
	public User getUserByUserName (String userName) {
		User foundedUser = new User();
		ArrayList<User> userList  = new ArrayList<>();
		userList = getUsers();
		
		for (int i = 0; i < userList.size(); i++) {
			String testUserName = userList.get(i).getUserName();
			if (testUserName.equals(userName)) {
				foundedUser = userList.get(i);
				break;
			} else {
				foundedUser = null;
			}
		} 
		return foundedUser;
	}
	
	public void registerEmployee(String name, String lastName, int id, String password, String userName, int userType) {
		
		String query;
		query = "Insert Into Employee (name, lastName, id, password, userName, userType) VALUES ('" + name + "','" + lastName + "','"
				+ id + "','" + password + "','" + userName + "','" + userType + "')";
		
		try {
			AccesoBD accesoDatos;
			accesoDatos = Conector.gestConecor();
			accesoDatos.ejecutarSQL(query);
		}catch (Exception e) {
			
		}
	}
		
	
	
}
