package dataaccess;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author leilany
 */
public class EditorialDbDao implements EditorialDao{
    
    private final Connection connection;
    
    /**
     * Inicializa una nueva instancia de AlumnoDbDao.
     * @param connection Objeto Connection a usar.
     */
    public EditorialDbDao(Connection connection) {
        this.connection = connection;
    }
     
    //Se creo la clase editorialDbDao y se agregaron los metodos que se piden
    
    @Override
    public Editorial getById(int editorialId) throws Exception {
        //Implementacion de metodo getById
        Editorial editorial = null;
        String sql = "SELECT * FROM alumnos_v WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, editorialId);
            try (ResultSet r = stmt.executeQuery()) {
                editorial = r.next() ? toObj(r) : null;
            }
        }
        return editorial;
    }
    
    @Override
    public Editorial[] getAll() throws Exception {
        //Implementacion de metodo getall
        ArrayList<Editorial> l = new ArrayList<>();
        String sql = "SELECT * FROM editorial WHERE Activo = 1 ORDER BY nombre";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            try (ResultSet r = stmt.executeQuery()) {
                while (r.next()) l.add(new Editorial(r));
            }
        }
        return l.toArray(new Editorial[] {});
    }
    
    @Override
    public int insert(Editorial i) throws Exception {
        //Implementacion de insert
        
        // Cuando ejecutamos un stored procedure, definimos la cantidad de 
        // parámetros con '?'. Nota: ver definición del stored procedure en
        // la base de datos.
        String sql = "CALL insert_editorial(?, ?, ?, ?)";
        
        // Usamos el objeto CallableStatement
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            
            // Agregamos los parámetros del stored procedure en orden.
            stmt.setString(1, i.getNombre());
            stmt.setString(2, i.getPais());
            stmt.setString(3, i.getEmail());
            stmt.setBoolean(4, i.isActivo());
            
            // El stored procedure regresa una consulta (instrucción SELECT),
            // por lo que obtenemos el resultset para obtener le resultado,
            // para este caso es el id del registro insertado.
            try (ResultSet r = stmt.executeQuery()) {
                r.next();  // nos movemos a la primera fila de la consulta
                i.setId(r.getInt("id"));  // obtenemos el resultado, el id...
            }
        }
        return i.getId();
    }
    
    @Override
    public void update(Editorial i) throws Exception {
        //Implementacion de update
        String sql = "CALL update_editorial(?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            stmt.setInt(1, i.getId());
            stmt.setString(2, i.getNombre());
            stmt.setString(3, i.getPais());
            stmt.setString(4, i.getEmail());
            stmt.setBoolean(5, i.isActivo());
            stmt.execute();  // este stored procedure no regresa resultado, por lo que uasmos execute().
        }
    }
    
    //Agregue en toObj cada uno
    private Editorial toObj(ResultSet r) throws Exception {
        Editorial i = new Editorial();
        i.setId(r.getInt("id"));
        i.setNombre(r.getString("nombre"));
        i.setPais(r.getString("pais"));
        i.setEmail(r.getString("email"));
        i.setActivo(r.getBoolean("fecha_ingreso"));        
        return i;
    }

}

