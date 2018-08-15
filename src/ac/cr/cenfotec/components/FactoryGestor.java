package ac.cr.cenfotec.components;


import ac.cr.cenfotec.gestores.GestorCompany;
import ac.cr.cenfotec.gestores.GestorDepartament;
import ac.cr.cenfotec.gestores.GestorProcedure;
import ac.cr.cenfotec.gestores.GestorUser;
import enums.GestorEnum;

public class FactoryGestor {

	public static GestorAbstract factoryGestor(GestorEnum pType)
	{
		switch (pType) {
		case USERS:
			return new GestorUser();
		case COMPANY: 
			return new GestorCompany();
		case DEPARTMENT: 
			return new GestorDepartament();
		case PROCEDURE: 
			return new GestorProcedure();
		default: 
			return null;
		}
	}
	
}
