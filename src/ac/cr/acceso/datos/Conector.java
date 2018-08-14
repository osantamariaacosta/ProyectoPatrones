/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.acceso.datos;

import java.io.BufferedReader;

import java.io.FileReader;
import ac.cr.acceso.datos.AccesoDB;

/**
 *
 * @author jorge
 */
public class Conector {
    //atributo de la clase	
        private static AccesoDB connectorBD = null;
        private static final String FILENAME = "base_datos.txt";
	
	/**
	 *Método estático que devuelve el 
	 *objeto AccesoBD para que sea utilizado
	 *por las clases
	 *@return objeto del tipo AccesoBD del paquete 
	 *CapaAccesoDatos
     * @throws java.sql.SQLException
	 */

	public static AccesoDB getConector() throws java.sql.SQLException,Exception{
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
        try {
            String driver = null; // "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String conexion = null; // "jdbc:sqlserver://" + desktop + "\\SQLFULL:1433;DatabaseName=" + database + ";user=" + user + ";password=" + password + "";
            
           //  com.microsoft.sqlserver.jdbc.SQLServerDriver,jdbc:sqlserver://DESKTOP-74PHBO7;databaseName=ProyectoPatrones;integratedsecurity = true

            
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] arr = everything.split(",");
            String driverTxt = arr[0];
            String connectionUrl = arr[1];

            driver = driverTxt;
            conexion = connectionUrl;
            if(connectorBD == null){
                connectorBD = new AccesoDB(driver,conexion);
            }
            
            
        } finally {
            br.close();
        }

        //Leer los datos del archivo de texto

        return connectorBD;
    }
}
