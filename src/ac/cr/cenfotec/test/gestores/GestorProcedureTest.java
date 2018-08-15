package ac.cr.cenfotec.test.gestores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.gestores.GestorProcedure;

class GestorProcedureTest {

GestorProcedure gestorProcedure;
	
	@Before
	public void inicialize()
	{
		gestorProcedure = new GestorProcedure();
	}
	
	@Test
	public void registerProcedure() throws Exception
	{
		// assertTrue(gestorProcedure.registerProcedure("Calificar", "123", "Calificar cursos"));
	}
	
	

}
