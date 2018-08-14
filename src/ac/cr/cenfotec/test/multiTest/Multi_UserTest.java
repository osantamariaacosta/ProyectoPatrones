package ac.cr.cenfotec.test.multiTest;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Employee;
import ac.cr.cenfotec.multis.Multi_User;

public class Multi_UserTest {

	Multi_User multiUser;
	
	@Before
	public void inicialize()
	{
		multiUser = new Multi_User();
	}
	
	@Test
	public void registerEmployee()
	{
		// assertTrue(multiUser.registerEmployee("Javier", "Pozuelo", 20, "abc123", "Jav", 0));
	}
	
	@Test 
	public void listarEmpleado() throws Exception
	{
		ArrayList<Employee> lista = new ArrayList<>();
		// assertTrue(lista.size() != multiUser.listarEmpleado().size());
	}
	
	public void listarUsers() throws Exception
	{
		// ArrayList<User> lista = new ArrayList<>();
		// assertTrue(lista.size() != multiUser.listarUsers().size());
	}
	
	

}
