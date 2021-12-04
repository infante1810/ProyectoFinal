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
