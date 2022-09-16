
package sorteador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        view.addCargarListener( new CargarListener() );
        view.addSortearListener( new SortearListener() );
        view.addReiniciarListener( new ReiniciarListener() );
        view.iniciar();
//        try {
//            model.cargarDatos("D:\\Users\\Charly\\Desktop\\texto.txt");
//            view.mostrarInfo(model.getProximoSorteado());
//        } catch (IOException ex) {
//            view.mostrarError("Algo pasó mal :(");
//        }
    }
    
    public void cargarDatos() {
        try {
            model.cargarDatos(view.getRuta());
            view.mostrarInfo("Datos cargados exitosamente");
        } catch (FileNotFoundException ex) {
            view.mostrarError("Archivo no encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            view.mostrarError("Error de E/S");
        }
    }
    
    public void reiniciar() {
        view.mostrarError("reiniciar PENDIENTE");
    }
    
    public void sortear() {
        try {
            view.mostrarSorteado(model.getProximoSorteado());  
        } catch(Exception e) {
            view.mostrarError(e.getMessage());
        }
              
    }
    
    private class CargarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cargarDatos();
        }
    }
    
    private class SortearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sortear();
        }
    }
    
    private class ReiniciarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            reiniciar();
        }
    }
    
    
}
