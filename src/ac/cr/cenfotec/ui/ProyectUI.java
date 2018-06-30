package ac.cr.cenfotec.ui;

// UI imports 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//Manager imports
import ac.cr.cenfotec.managers.Authenticator_Manager;

public class ProyectUI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static Authenticator_Manager authManager = new Authenticator_Manager();
	
	
	public static void main(String[] args) throws Exception
	{
		showMainMenu();
	}
	
	
	public static void showMainMenu () throws Exception
	{
		boolean end = false;
		
		do {
			try {
				
				end = showLoginMenu();
				if (end) {
					showSystemMenu();
				} else {
					System.out.println("Credenciales invalidas, por favor intente nuevamente");
				}				
				
			} catch (Exception error) {
				
				System.out.println(error);
				System.out.println(error.getMessage());
				
			}
		} while (end !=true);

	}
	
	
	public static boolean showLoginMenu () throws IOException, Exception
	{
		
		String userName, password;
		boolean isAuthenticated = false;
		
		out.println("Formulario inicio de sesion");
		out.println("Ingrese su nombre de usuario");
		userName = in.readLine();
		out.println("Ingrese su contrasena");
		password = in.readLine();
		
		isAuthenticated = verifyCredentials(userName, password);
		
		if (isAuthenticated) 
		{
				return true;				
			
		} else {
			
				return false;
				
			}
	}
	
	
	public static boolean verifyCredentials(String userName, String password) throws Exception 
	{
		return authManager.validateCredentials(userName, password);
	}
	
	
	public static void showSystemMenu () {
		if (authManager.getUserAutenticated().getUserType() == 0) {
			showAdminMenu();
		} else if (authManager.getUserAutenticated().getUserType() == 1) {
			showUserMenu();
		}
	}	
	
	
	public static void showAdminMenu() 
	{
		int option;
		boolean end = false;
		
		do {
			try {
				showAdminOptions();
				option = readOption();
				end = excuteAdminOption(option);
			}
			catch (Exception error) {
				System.out.println(error);
				System.out.println(error.getMessage());
			}
			
		}while(end != true);
	}	
	

	public static void showAdminOptions ()
	{
		out.println("Seleccione una opci\u00f3n");
		out.println("1.Registrar Organizaci\u00f3n");
		out.println("2.Registrar un empleado");
		out.println("3.Registrar un proceso");
		out.println("4.Registrar tarea");
		out.println("5.Modificar tarea");
		out.println("6.Ver historial de tareas");
		out.println("7.Cerrar Sesi\u00f3n");
	}
	
	public static void showUserMenu() 
	{
		int option;
		boolean end = false;
		
		do {
			try {
				showUserOptions();
				option = readOption();
				end = excuteUserOption(option);
			}
			catch (Exception error) {
				System.out.println(error);
				System.out.println(error.getMessage());
			}
			
		}while(end != true);
	}	
	
		
	public static void showUserOptions() 
	{
		out.println("Seleccione una opci\u00f3n");
		out.println("1.Modificar tarea");
		out.println("2.Ver historial de tareas");
		out.println("3.Cerrar Sesi\u00f3n");		
	}
	

	public static int readOption() throws NumberFormatException, IOException 
	{
		int option;
		out.println("Ingrese la opci\u00f3n que desea realizar");
		option = Integer.parseInt(in.readLine());
		return option;
	}	
	
	
	public static boolean excuteUserOption (int option) throws InterruptedException, IOException, Exception 
	{
		boolean end = false;
		
		switch (option) {
			
			case 1:
				break;
				
			case 2: 
				break;
			
			case 3:
				closeSession(); 
				break;
			
			default: 
				break;
				
		}
		
		return end; 
	}
	

	public static boolean excuteAdminOption (int option) throws Exception
	{
		boolean end = false;
		
		switch (option) {
			
			case 1:
				break;
				
			case 2: 
				break;
			
			case 3:
				break;
				
			case 4:
				break;
				
			case 5: 
				break;
			
			case 6:
				break;
				
			case 7:
				closeSession(); 
				break;
			
			default: 
				break;
				
		}
		
		return end; 
	}	
	

	public static void closeSession () throws Exception
	{
		authManager.clearUserAuthenticated();
		clearConsole();
		showMainMenu();
	}
	
	
	public final static void clearConsole() throws Exception
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}	
	
	
}
