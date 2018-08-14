/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.acceso.datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jorge
 */
public class AccesoDB {
    //atributos del objeto
	private Connection conn=null;
	private Statement st;
	
	/**
	 *Método constructor que recibe todos
	 *los parámetros necesarios para abrir
	 *una conexión válida
	 *@param driver especificación del tipo
	 *de driver que se utiliza, el cual responde
	 *al repositorio utilizado
	 *@param conexion cadena de conexión con la
	 *base de datos
	 *@param usuario nombre del usuario de la base 
	 *de datos, si no se utiliza, se debe enviar
	 *un string vacío
	 *@param clave palabra clave del usuario
	 *para realizar su autenticación en la base
	 *de datos
         * @throws java.sql.SQLException
	 */	
	public AccesoDB(String driver,String conexion) throws SQLException{
		conn = DriverManager.getConnection(conexion);
		st = conn.createStatement();
	}
	public PreparedStatement getPreparedStatement(String sql) throws SQLException{
            return conn.prepareStatement(sql);
        }
        
        public CallableStatement getCallableStatement(String sql) throws SQLException{
            return conn.prepareCall(sql);
        }
	/**
	 *Método que ejecuta una sentencia en la
	 *base de datos, la cual no tiene retorno,
	 *es decir un insert, delete o update
	 *@param sentencia cadena sql que será
	 *ejecutada en la base de datos
	 *
	 */
	
	public void ejecutarSQL(String sentencia) 
	throws SQLException{	
		st.execute(sentencia);		
	}
	
	/**
	 *Método que ejecuta una sentencia en la
	 *base de datos y devuelve un ResultSet
	 *con los resultados	 
	 *@param sentencia cadena sql que será
	 *ejecutada en la base de datos
	 *@param retorno booleana que indica que se
	 *desea un resultado de la consulta
	 */	
	public ResultSet ejecutarSQL(String sentencia,
	boolean retorno)
	throws SQLException{
		ResultSet rs;
		rs = st.executeQuery(sentencia);
		return rs;
	}
	
	/**
	 *Permite controlar el inicio una transacción 
	 *desde afuera.  A partir de este momento 
	 *todas las sentencias esperarán la orden para
	 *ser aceptadas en la base de datos
	 *
	 */
	public void iniciarTransaccion()
	throws java.sql.SQLException{
		conn.setAutoCommit(false);	
	}
	
	/**
	 *Permite controlar el término una transacción 
	 *desde afuera.  A partir de este momento 
	 *todas las sentencias se ejecturán de forma
	 *individual en la base de datos
	 *
	 */
	
	public void terminarTransaccion()
	throws java.sql.SQLException{
		conn.setAutoCommit(true);
	}
	
	/**
	 *Indica que la transacción ha sido aceptada
	 *
	 */	
	
	public void aceptarTransaccion()
	throws java.sql.SQLException{
		conn.commit();
	}
	
	/**
	 *Indica que la transacción debe ser
	 *deshecha porque no se realizó de
	 *forma exitosa
	 *
	 */	
	
	public void deshacerTransaccion()
	throws java.sql.SQLException{
		conn.rollback();	
	}
	
	/**
	 *Método sobreescrito de la clase Object
	 *que es invocado por el Garbage Collector
	 *cuando es invocado libera la conexión
	 *abierta durante la creación del objeto
	 *
	 */
	protected void finalize(){
		try {
			conn.close();
                       
		}
		catch(SQLException e){
			/*este método es llamado por el
			 *garbage collector, por lo tanto
			 *se atrapa la excepción pero no se
			 *reporta*/			
		}
               
	}
}
