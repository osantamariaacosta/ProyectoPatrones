/**
 * 
 */
package ac.cr.cenfotec.multis;
import java.sql.ResultSet;
import java.util.ArrayList;


import ac.cr.cenfotec.clases.User;
import accesoDatos.AccesoBD;
import accesoDatos.Conector;
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
		query = "Insert Into User (name, lastName, id, password, userName, userType, firm, company, departament) VALUES ('" + name + "','" + lastName + "','"
				+ id + "','" + password + "','" + userName + "','" + userType + "','" + firm + "','" + company + "','" + departament + "')";
		
		try {
			
			AccesoBD accesoDatos;
			accesoDatos = Conector.getConector();
			accesoDatos.ejecutarSQL(query);
			return true;
		}catch (Exception error) {
			System.out.println(error);
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	 public ArrayList<Employee> listarUser() throws Exception 
	 {
	        ArrayList<Employee> lista = new ArrayList<>();

	        String query;
	        query = "SELECT * FROM TUser WHERE userTYPE = '1'";

	        try {
	        	
	            AccesoBD accesoDatos;
	            accesoDatos = Conector.getConector();
	            ResultSet rs = accesoDatos.ejecutarSQL(query);
	            while (rs.next()) {
	                Employee tmpEmpleado = new Employee();

	                tmpEmpleado.setName(rs.getString("name"));
	                tmpEmpleado.setLastName(rs.getString("lastName"));
	                tmpEmpleado.setId(rs.getInt("id"));
	                tmpEmpleado.setCompany(rs.getString("company"));
	                tmpEmpleado.setDepartamentId(rs.getInt("departamentId"));
	              	lista.add(new Employee("Carlos","Garro", 02, "abc123", "carGa", 1, "firma", 01, 02)); 
	        	return lista;
	        } catch (Exception error) {
	            System.out.println(error);
	            System.out.println(error.getMessage());
				return lista;
	        }

	    }
		
	
	
}
