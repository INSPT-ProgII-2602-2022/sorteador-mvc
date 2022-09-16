
package sorteador.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class VisorDeTXTs {
    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);        
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println( br.readLine());
        System.out.println( br.readLine());
    }
    
    public List<String> getLineasDeTxt(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);        
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        List<String> lista = new ArrayList<>();
        
        String linea = br.readLine();
        while (linea != null) {
            lista.add(linea);
            linea = br.readLine();
        }
        return lista;
    }
}
