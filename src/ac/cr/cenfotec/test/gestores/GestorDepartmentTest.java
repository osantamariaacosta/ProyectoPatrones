package ac.cr.cenfotec.test.gestores;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Department;
import ac.cr.cenfotec.gestores.GestorDepartament;


class GestorDepartmentTest {

GestorDepartament gestorDepartament;
	
	@Before
	public void inicialize()
	{
		gestorDepartament = new GestorDepartament();
	}
	
	@Test
	public void registerDepartament() throws Exception
	{
		// assertTrue(getorDepartament.reogsterDepartament("Decanatura", "1234", "deperatmento de universidad", "123"));
	}
	
	
	@Test 
	public void listarDepartamento() throws Exception
	{
		// ArrayList<Departament> lista = new ArrayList<>();
		// assertTrue(lista.size() != gestorDepartament.listarDepartamento().size());
	}

}
