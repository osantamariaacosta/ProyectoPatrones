package ac.cr.cenfotec.test.Authenticator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.managers.Authenticator_Manager;

public class AuthenticatorTest {

	Authenticator_Manager auth;
	
	@Before
	public void inicializate()
	{
		auth = new Authenticator_Manager();
	}
	
	@Test
	public void validateCredentials() throws Exception {
		assertTrue (auth.validateCredentials("carGa", "abc123"));
	}

	@Test
	public void isAuthenticatorUserRegistered() throws Exception {
		auth.validateCredentials("carGa", "abc123");
		assertTrue(auth.getUserAutenticated() != null);
	}	
	
}
