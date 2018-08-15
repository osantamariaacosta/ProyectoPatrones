package ac.cr.cenfotec.test.multiTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.clases.Procedure;
import ac.cr.cenfotec.multis.MultiProcedure;


class MultiProcedureTest {

MultiProcedure multiProcedure;
	
	@Before
	public void inicialize()
	{
		multiProcedure = new MultiProcedure();
	}
	
	@Test
	public void registerProcedure()
	{
		// assertTrue(multiProcedure.registerProcedure("Calificar", "123", "Calificar cursos"));
	}

}
