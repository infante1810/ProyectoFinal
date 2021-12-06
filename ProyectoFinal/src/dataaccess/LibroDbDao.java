package dataaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.util.ArrayList;

/**
 * Implementación del Data Access Object de Libro.
 * @author luisroberto
 */
public class LibroDbDao implements LibroDao {

    private final Connection connection;
    
    public LibroDbDao(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public Libro[] getAll() throws Exception {
        //Implementacion de metodo getall
        ArrayList<Libro> l = new ArrayList<>();
        String sql = "SELECT * FROM libros WHERE Activo = 1 ORDER BY titulo";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            try (ResultSet r = stmt.executeQuery()) {
                while (r.next()) l.add(toObj(r));
            }
        }
        return l.toArray(new Libro[] {});
    }
    
    @Override
    public Libro getById(int libroId) throws Exception {
        Libro i = null;
        String sql = "SELECT * FROM libros WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, libroId);
            try (ResultSet r = stmt.executeQuery()) {
                if (r.next()) i = toObj(r);
            }
        }
        return i;
    }
    
     public Libro[] getByName(String libroName) throws Exception {
        //Implementacion de metodo getById
        ArrayList<Libro> libro = new ArrayList<>();
        
         String sql = "SELECT * FROM Libros ORDER BY titulo";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
             try (ResultSet r = stmt.executeQuery()) {
                System.out.println("executenms");
                while (r.next()){
              
                    if(r.getString("titulo").equals(libroName)){
                        libro.add(toObj(r));
                        System.out.println("executing succesfull-concidencia");
                    }
                    
                };
                System.out.println("executing succesfullsi");
            }
        }
        return libro.toArray(new Libro[]{});
    }
    

    //TOFIX problem here to insert
    @Override
    public int insert(Libro i) throws Exception {
        String sql = "CALL insert_libro(?, ?, ?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            stmt.setString(1, i.getTitulo());
            stmt.setInt(2, Integer.parseInt(i.getTipoRecurso()));
            stmt.setInt(3, i.getStock());
            stmt.setInt(4, Integer.parseInt(i.getEditorial()));  // NOTA: Se maneja así porque es un int que puede ser null.
            stmt.setString(5, i.getAutores());
            stmt.setString(6, i.getIsbn());
            stmt.setBoolean(7, i.isActivo());
            try (ResultSet r = stmt.executeQuery()) {
                r.next();
                i.setId(r.getInt("id"));
            }
        }catch(Exception e){
        }
        return i.getId();
    }

    @Override
    public void update(Libro i) throws Exception {
        String sql = "CALL update_libro(?, ?, ?, ?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            stmt.setString(1, i.getTitulo());
            stmt.setString(2, i.getTipoRecurso());
            stmt.setString(4, i.getEditorial());  // NOTA: Se maneja así porque es un int que puede ser null.
            stmt.setString(5, i.getAutores());
            stmt.setString(6, i.getIsbn());
            stmt.setBoolean(7, i.isActivo());
            stmt.execute();
        }
    }
    
    private Libro toObj(ResultSet r) throws Exception {
        Libro i = new Libro();
        i.setId(r.getInt("id"));
        i.setTitulo(r.getString("titulo"));
        i.setStock(r.getInt("stock"));
        i.setTipoRecurso(r.getString("tipo_recurso_id"));
        i.setEditorial(r.getString("editorial_id")); // NOTA: Se maneja así porque es un int que puede ser null.
        i.setAutores(r.getString("autores"));
        i.setIsbn(r.getString("isbn"));
        i.setActivo(r.getBoolean("activo"));
        return i;
    }
}
