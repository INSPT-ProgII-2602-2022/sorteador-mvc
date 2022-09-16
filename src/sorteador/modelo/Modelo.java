
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
    private Sorteador<String> sorteador;
    
    public Modelo() {
        visor = new VisorDeTXTs();
        sorteador = new Sorteador<>();
    }
    
    public void cargarDatos(String ruta) throws IOException {
        sorteador.add(visor.getLineasDeTxt(ruta));
    }
    
    public String getProximoSorteado() {
        return sorteador.remove();
    }
    
}
