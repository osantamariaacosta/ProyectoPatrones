package ac.cr.cenfotec.test.gestores;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Employee;
import ac.cr.cenfotec.gestores.GestorUser;

public class GestorUserTest {

	GestorUser gestorUser;
	
	@Before
	public void inicialize()
	{
		gestorUser = new GestorUser();
	}
	
	@Test
	public void registerEmployee() throws Exception
	{
		assertTrue(gestorUser.registerEmployee("Javier", "Pozuelo", 20, "abc123", "Jav", 0));
	}
	
	
	@Test 
	public void listarEmpleado() throws Exception
	{
		ArrayList<Employee> lista = new ArrayList<>();
		assertTrue(lista.size() != gestorUser.listarEmpleado().size());
	}

}
