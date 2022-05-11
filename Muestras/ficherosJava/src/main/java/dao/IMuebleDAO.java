
package dao;

import java.util.List;

/**
 *
 * @author JCarlos
 */
public interface IMuebleDAO {
     
    boolean insertMueble(MuebleVO mueble);
    
    int insertMueble(List<MuebleVO> lista);
    
    boolean deleteMueble(MuebleVO mueble);
    
    boolean updateMueble(String pk, MuebleVO mueble);
    
    List<MuebleVO> getAll();
    
    MuebleVO findByPk(String pk);
    
}
