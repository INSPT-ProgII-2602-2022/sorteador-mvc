
package sorteador;

import java.io.IOException;
import sorteador.modelo.Modelo;
import sorteador.vista.IVista;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Controlador {
    private Modelo model;
    private IVista view;

    public Controlador(Modelo model, IVista view) {
        this.model = model;
        this.view = view;
    }
    
    public void iniciar() {
        try {
            model.cargarDatos("D:\\Users\\Charly\\Desktop\\texto.txt");
            view.mostrarInfo(model.getProximoSorteado());
        } catch (IOException ex) {
            view.mostrarError("Algo pasó mal :(");
        }
    }
    
    
    
}
