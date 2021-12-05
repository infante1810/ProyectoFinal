package dataaccess;

/**
 * Define el Data Access Object del View de libros_inventario_v.
 * @author luisroberto
 */
public interface LibroInventarioVDao {
    
    /**
     * Obtiene todos los registros de invnetario de un libro en específico.
     * @param libroId El identificador del libro.
     * @return
     * @throws Exception 
     */
    LibroInventarioV[] getByLibroId(int libroId) throws Exception;
    
    /**
     * Obtiene un registro (obj LibroInventarioV) por su identificador.
     * @param libroInventarioId Identificador del registro.
     * @return Un objeto LibroInventarioV si existe; de otra forma, null.
     * @throws Exception 
     */
    LibroInventarioV getByLibroInventarioId(int libroInventarioId) throws Exception;    
}
