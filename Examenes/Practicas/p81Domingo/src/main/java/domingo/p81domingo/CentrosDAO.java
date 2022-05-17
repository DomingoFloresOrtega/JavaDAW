
package domingo.p81domingo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domingo
 */
public class CentrosDAO implements ICentros {

    private Connection con = null;

    public CentrosDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<CentrosVO> getAll() throws SQLException {
        List<CentrosVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas
            ResultSet res = st.executeQuery("select * from centros");
            // Construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                CentrosVO c = new CentrosVO();
                // Recogemos los datos del centro y lo guardamos en un objeto
                c.setNumce(res.getInt("numce"));
                c.setNomce(res.getString("nomce"));
                c.setDirce(res.getString("dirce"));
                c.setCodPostal(res.getString("codpostal"));

                lista.add(c);
            }
        }

        return lista;
    }

    @Override
    public CentrosVO findByPk(int pk) throws SQLException {

        ResultSet res = null;
        CentrosVO c = new CentrosVO();

        String sql = "select * from centros where numce=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset
            if (res.next()) {
                // Recogemos los datos del centro y lo guardamos en un objeto
                c.setNumce(res.getInt("numce"));
                c.setNomce(res.getString("nomce"));
                c.setDirce(res.getString("dirce"));
                c.setCodPostal(res.getString("codpostal"));
                
                return c;
            }

            return null;
        }
    }

    @Override
    public int insertCentro(CentrosVO centro) throws SQLException {

        int numFilas = 0;
        String sql = "insert into centros values (?,?,?,?)";

        if (findByPk(centro.getNumce()) != null) {
            // Si existe un registro con esa pk no se realiza la inserción
            return numFilas;
        } else {
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, centro.getNumce());
                prest.setString(2, centro.getNomce());
                prest.setString(3, centro.getDirce());
                prest.setString(4, centro.getCodPostal());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertCentro(List<CentrosVO> lista) throws SQLException {
        int numFilas = 0;

        for (CentrosVO tmp : lista) {
            numFilas += insertCentro(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteCentro() throws SQLException {

        String sql = "delete from centros";

        int nfilas = 0;

        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deleteCentro(CentrosVO centro) throws SQLException {
        int numFilas = 0;

        String sql = "delete from centros where numce = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, centro.getNumce());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateCentro(int pk, CentrosVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update centros set nomce = ?, dirce = ?, codpostal = ? where numce=?";

        if (findByPk(pk) == null) {
            // El centro para actualizar no existe
            return numFilas;
        } else {
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, nuevosDatos.getNomce());
                prest.setString(2, nuevosDatos.getDirce());
                prest.setString(3, nuevosDatos.getCodPostal());
                prest.setInt(4, pk);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }
}

