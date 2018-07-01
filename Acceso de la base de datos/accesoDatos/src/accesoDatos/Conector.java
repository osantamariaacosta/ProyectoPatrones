package accesoDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase Conector
 *
 * @version 1.0
 * @author Laura Monge Izaguirre Clase que inicializa la conexi�n con los
 * valores correctos y permite manejar una �nica conexi�n para todo el proyecto
 * y
 *
 */
public class Conector {
    
    private static AccesoBD conectorBD = null;
    
            
    public static AccesoBD getConector() throws Exception {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String conecctionUrl;
        String desktop = null;
        String database = null;
        String user = null;
        String password = null;

        try {
            FileReader reader = new FileReader("Conexion.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            String info[];

            while ((datos = buffer.readLine()) != null) {
                info = datos.split(",");
                desktop = info[0];
                database = info[1];
                user = info[2];
                password = info[3];
            }
            reader.close();

        } catch (IOException e) {

        }
        conecctionUrl = "jdbc:sqlserver://" + desktop + "\\SQLFULL:1433;DatabaseName=" + database + ";user=" + user + ";password=" + password + "";
        if (conectorBD == null) {
            conectorBD = new AccesoBD(driver, conecctionUrl);

        }
        return conectorBD;
    }

}