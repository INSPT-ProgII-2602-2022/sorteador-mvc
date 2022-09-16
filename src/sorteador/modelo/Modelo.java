
package sorteador.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Modelo {

    private VisorDeTXTs visor;
    private List<String> laLista;
    private Random randomGenerator;
    
    public Modelo() {
        visor = new VisorDeTXTs();
        laLista = new ArrayList<>();
        randomGenerator = new Random();
    }
    
    public void cargarDatos(String ruta) throws IOException {
        laLista = visor.getLineasDeTxt(ruta);
    }
    
    public String getProximoSorteado() {
        int rnd = randomGenerator.nextInt(laLista.size());
        return laLista.remove(rnd);        
    }
    
}
