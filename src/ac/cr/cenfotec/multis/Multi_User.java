/**
 * 
 */
package ac.cr.cenfotec.multis;
import java.sql.ResultSet;
import java.util.ArrayList;


import ac.cr.cenfotec.clases.User;
import com.cenfotec.AccesoDatos.*;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.clases.Employee;


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
	
	public boolean registerUser(String name, String lastName, int id, String password, String userName, int userType, String firm, String company, String departament)
	{
		
		String query;
		query = "Insert Into TUser (name, lastName, id, password, userName, userType, firm, company, departament) VALUES ('" + name + "','" + lastName + "','"
				+ id + "','" + password + "','" + userName + "','" + userType + "','" + firm + "','" + company + "','" + departament + "')";
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
		}catch (Exception error) {

			return true;
		}
	}
	
	 public ArrayList<Employee> listarEmpleados() throws Exception 
	 {
	        ArrayList<Employee> lista = new ArrayList<>();
	        Employee tmpEmpleado = new Employee();

	        String query;
	        query = "SELECT * FROM TUser WHERE userType = '1'";
	        	
    		try  (ResultSet rs = Conector.getConector().getDatosSQL(query)) {
    			while (rs.next()) {
    				lista.add(tmpEmpleado = new Employee(
    						rs.getString("name"),
    						rs.getString("lastName"),
    						rs.getInt("id"),
    						rs.getString("password"),
    						rs.getString("userName"),
    						rs.getInt("userType"),
    						rs.getString("firm"),
    						rs.getString("company"),
    						rs.getString("departament")));
    			}
	    			
	    		rs.close();
	        	return lista;
	        } catch (Exception error) {
	            System.out.println(error);
	            System.out.println(error.getMessage());
				return lista;
	        }

		
	 }
	
}
