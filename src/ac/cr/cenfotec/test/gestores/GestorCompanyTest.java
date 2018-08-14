package ac.cr.cenfotec.test.gestores;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.gestores.GestorCompany;

//import org.junit.jupiter.api.Test;

class GestorCompanyTest {

GestorCompany gestorCompany;
	
	@Before
	public void inicialize()
	{
		gestorCompany = new GestorCompany();
	}
	
	@Test
	public void registerCompany() throws Exception
	{
		// assertTrue(gestorCompany.registerCompany("123", "Cenfotec", "Universidad"));
	}
	
	
	@Test 
	public void listarCompania() throws Exception
	{
		ArrayList<Company> lista = new ArrayList<>();
		// assertTrue(lista.size() != gestorCompany.listarCompania().size());
	}
	
}
