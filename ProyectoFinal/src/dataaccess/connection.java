<<<<<<< HEAD
package dataaccess;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author
 */
class Connection {

    
    private final String DB_NAME = "biblioteca";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "root";
    private final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.DB_URL, this.DB_USERNAME, this.DB_PASSWORD);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }
    
}
=======
package dataaccess;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;

/**
 *
 * @author maria
 */
class connection {

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static CallableStatement prepareCall(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
>>>>>>> 7755f904b36f5a91d2f5af0eeb9cc79d0651f40e
