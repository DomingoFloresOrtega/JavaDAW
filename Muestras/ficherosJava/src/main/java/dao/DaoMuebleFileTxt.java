
package dao;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author JCarlos
 */
public class DaoMuebleFileTxt implements IMuebleDAO {

    public static final String FILE_NAME = "mueblesDAO.txt";

    @Override
    public boolean insertMueble(MuebleVO mueble) {
        if (!exist(mueble.getId())) {
            try (BufferedWriter flujo = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                flujo.write(mueble.toString());
                flujo.newLine();
                flujo.flush();
                return true;

            } catch (IOException e) {
                return false;
            }

        }
        return false;
    }

    @Override
    public int insertMueble(List<MuebleVO> lista) {
        int contador = 0;

        if (!lista.isEmpty()) {
            try (BufferedWriter flujo = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                for (MuebleVO muebleVO : lista) {
                    if (!exist(muebleVO.getId())) {
                        flujo.write(muebleVO.toString());
                        flujo.newLine();
                        contador++;
                    }
                }

                flujo.flush();
            } catch (IOException e) {
                return contador;
            }
        }
        return contador;
    }

    @Override
    public boolean deleteMueble(MuebleVO mueble) {
        if (mueble != null) {
            if (exist(mueble.getId())) {
                try {
                    List<MuebleVO> lista = getAll().stream()
                            .filter(m -> !m.getId().equalsIgnoreCase(mueble.getId()))
                            .collect(Collectors.toList());

                    Files.delete(Paths.get(FILE_NAME));
                    Files.createFile(Paths.get(FILE_NAME));
                    insertMueble(lista);
                    return true;
                } catch (IOException ex) {
                    return false;
                }
            }
            return false;
        } else {
            throw new IllegalArgumentException("El parámetro es null");
        }
    }

    @Override
    public boolean updateMueble(String pk, MuebleVO mueble) {
        if (mueble != null && pk != null) {
            if (pk.equalsIgnoreCase(mueble.getId())){
                if (exist(mueble.getId())){
                    deleteMueble(mueble);
                    insertMueble(mueble);
                    return true;
                }
            }
            return false;
        } else {
            throw new IllegalArgumentException("Existen parámetros null");
        }
    }

    @Override
    public List<MuebleVO> getAll() {

        List<MuebleVO> lista = new ArrayList<>();
        String linea;
        String[] tokens;

        try (Scanner datosFichero = new Scanner(new FileReader(FILE_NAME))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                tokens = linea.split(";");

                lista.add(new MuebleVO(tokens[0], tokens[1],
                        Double.parseDouble(tokens[2]),
                        Double.parseDouble(tokens[3]),
                        Double.parseDouble(tokens[4])));
            }

            return lista;

        } catch (FileNotFoundException e) {
            return lista;
        }
    }

    @Override
    public MuebleVO findByPk(String pk) {

        Optional<MuebleVO> mueble = Optional.empty();
        
        if (exist(pk)) {
            List<MuebleVO> lista = getAll();
            mueble = lista.stream()
                    .filter(m -> m.getId().equalsIgnoreCase(pk))
                    .findFirst();
        }
        
        return mueble.orElse(new MuebleVO());
    }

    public boolean exist(String pk) {
        List<MuebleVO> lista = getAll();

        if (!lista.isEmpty()) {
            return lista.stream()
                    .anyMatch(m -> m.getId().equalsIgnoreCase(pk));
        }

        return false;
    }

}
