
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe Obando Arrieta
 */
public class Conexion {
    public static Connection getConexion(String user,String password){
        String usuarioCompleto="user="+user+";";
        String passwordCompleta="password="+password+";";
        String conexionURL = "jdbc:sqlserver://localhost:1433;"//donde esta corriendo la base de datos
                + "database=master;"//base de datos a la que me quiero conectar
                +"encrypt=false;"
                + usuarioCompleto//login + "user=sa;"//login
                + passwordCompleta//login
                + "loginTimeOut=60;";//cuanto tiempo para poderse conectar
        try {
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        } catch (SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
