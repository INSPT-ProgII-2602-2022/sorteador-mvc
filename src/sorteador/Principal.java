
package sorteador;

import sorteador.modelo.Modelo;
import sorteador.vista.IVista;
import sorteador.vista.vistaconsola.VistaConsola;
import sorteador.vista.vistaswing.VistaSwing;


/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Modelo m = new Modelo();
        IVista v = new VistaSwing();
        Controlador c = new Controlador(m,v);
        c.iniciar();
    }

}
