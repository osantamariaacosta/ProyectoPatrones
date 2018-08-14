package ac.cr.cenfotec.test.multiTest;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.clases.Department;
import ac.cr.cenfotec.multis.MultiCompany;
import ac.cr.cenfotec.multis.MultiDepartament;


class MultiDepartmentTest {

MultiDepartament multiDepartment;
	
	@Before
	public void inicialize()
	{
		multiDepartment = new MultiDepartament();
	}
	
	@Test
	public void registerDepartament()
	{
		// assertTrue(multiDepartment.registerDepartament("Decanatura", "1234", "deperatmento de universidad", "123"));
	}
	
	@Test 
	public void listarDepartamento() throws Exception
	{
		ArrayList<Department> lista = new ArrayList<>();
		// assertTrue(lista.size() != multiDepartment.listarDepartamento().size());
	}

}
