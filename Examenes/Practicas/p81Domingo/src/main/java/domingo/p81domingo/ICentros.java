/*
 * Interface que usa el patrón DAO sobre la tabla Persona
 */

package domingo.p81domingo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author domingo
 */

public interface ICentros {
    
    // Método para obtener todos los registros de la tabla
    List<CentrosVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    CentrosVO findByPk(int pk) throws SQLException;
    
    // Método para insertar un registro
    int insertCentro (CentrosVO persona) throws SQLException;
    
    // Método para insertar varios registros
    int insertCentro (List<CentrosVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deleteCentro (CentrosVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteCentro() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateCentro (int pk, CentrosVO nuevosDatos) throws SQLException;
}
