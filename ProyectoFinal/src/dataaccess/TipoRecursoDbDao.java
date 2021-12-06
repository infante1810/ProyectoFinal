package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author leilany
 */
public class TipoRecursoDbDao implements TipoRecursoDao{
    
    private final Connection connection;
    
    /**
     * Inicializa una nueva instancia de AlumnoDbDao.
     * @param connection Objeto Connection a usar.
     */
    
    //Aca cree la clase TipoRecursoDbDao y agregue el metodo getall segun lo que
    //se pide en el TipoRecursoDao
    //Aca no agregue toobj porque no lo pide 
    public TipoRecursoDbDao(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public TipoRecurso[] getAll() throws Exception {
        //Implementacion de metodo getall
        ArrayList<TipoRecurso> l = new ArrayList<>();
        String sql = "SELECT * FROM tipos_recursos WHERE Activo = 1 ORDER BY nombre";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            try (ResultSet r = stmt.executeQuery()) {
                while (r.next()) l.add(new TipoRecurso(r));
            }
        }
        return l.toArray(new TipoRecurso[] {});
    }
    public String[] getComboData() throws Exception {
        //Implementacion de metodo getall
        ArrayList<String> l = new ArrayList<>();
        String sql = "SELECT nombre FROM tipos_recursos WHERE activo = 1 ORDER BY nombre";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            System.out.println("preparestatement");
            try (ResultSet r = stmt.executeQuery()) {
                System.out.println("execute");
                while (r.next()) l.add(r.getString("nombre"));
                System.out.println("executing succesfull");
            }
        }
        return l.toArray(new String[] {});
    }
    
}
