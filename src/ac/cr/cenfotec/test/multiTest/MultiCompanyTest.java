package ac.cr.cenfotec.test.multiTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Company;
import ac.cr.cenfotec.multis.MultiCompany;


class MultiCompanyTest {

	MultiCompany multiCompany;
	
	@Before
	public void inicialize()
	{
		multiCompany = new MultiCompany();
	}
	
	@Test
	public void registerCompany()
	{
		// assertTrue(multiCompany.registerCompany("123", "Cenfotec", "Universidad"));
	}
	
	@Test 
	public void listarCompania() throws Exception
	{
		ArrayList<Company> lista = new ArrayList<>();
		// assertTrue(lista.size() != multiCompany.listarCompania().size());
	}

}
