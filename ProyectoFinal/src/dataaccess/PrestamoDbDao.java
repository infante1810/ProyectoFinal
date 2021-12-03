package dataaccess;

import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Implementación de la funcionalidad de data access object para Prestamo.
 * @author luisroberto
 */
public class PrestamoDbDao implements PrestamoDao {

    private final Connection connection;
    
    public PrestamoDbDao(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public Prestamo getById(int prestamoId) throws Exception {
        //Implementacion de getById 
        Prestamo prestamo = null;
        String sql = "SELECT * FROM prestamo_v WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, prestamoId);
            try (ResultSet r = stmt.executeQuery()) {
                prestamo = r.next() ? toObj(r) : null;
            }
        }
        return prestamo;
    }

    @Override
    public int insert(Prestamo i) throws Exception {
        //Implementacion de metodo insert
        String sql = "CALL insert_alumno(?, ?, ?, ?, ?)";
        
        // Usamos el objeto CallableStatement
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            
            // Agregamos los parámetros del stored procedure en orden.
            stmt.setInt(1, i.getLibroInventarioId());
            stmt.setInt(2, i.getAlumnoId());
            stmt.setObject(3, i.getFechaPrestamo());
            stmt.setObject(4, i.getFechaDebeDevolver());
            stmt.setObject(5, i.getFechaDevuelto());
       
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
    public void update(Prestamo i) throws Exception {
        //Implementacion de metodo update
        String sql = "CALL update_alumno(?, ?, ?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(sql)) {
            stmt.setInt(1, i.getId());
            stmt.setInt(2, i.getLibroInventarioId());
            stmt.setInt(3, i.getAlumnoId());
            stmt.setObject(4, i.getFechaPrestamo());
            stmt.setObject(5, i.getFechaDebeDevolver());
            stmt.setObject(6, i.getFechaDevuelto());
            stmt.execute();  // este stored procedure no regresa resultado, por lo que uasmos execute().
        }
    }
    
    //Este ya estaba
    private Prestamo toObj(ResultSet r) throws Exception {
        Prestamo i = new Prestamo();
        i.setId(r.getInt("id"));
        i.setLibroInventarioId(r.getInt("libro_inventario_id"));
        i.setAlumnoId(r.getInt("alumno_id"));
        i.setFechaPrestamo(r.getObject("fecha_prestamo", LocalDateTime.class));
        i.setFechaDebeDevolver(r.getObject("fecha_debe_devolver", LocalDateTime.class));
        i.setFechaDevuelto(r.getObject("fecha_devuelto", LocalDateTime.class));
        return i;
    }
    
}
