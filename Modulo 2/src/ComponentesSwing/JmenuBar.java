/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author ervin caravali Ibarra
 */
public class JmenuBar extends JFrame {

    public JmenuBar() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        miLamin miLamina = new miLamin();
        add(miLamina);
    }

    private static class miLamin extends JPanel {

        public miLamin() {
            JMenuBar bar = new JMenuBar();
            JMenu archivo = new JMenu("Archivo");
            JMenu edicion = new JMenu("Edicíon");
            JMenu herramientas = new JMenu("Herramientas");
            JMenu opciones = new JMenu("OPciones");
            JMenuItem guardar = new JMenuItem("Guardar");
            JMenuItem guardarComo = new JMenuItem("Guardar Como");
            JMenuItem cortar = new JMenuItem("Cortar");
            JMenuItem copiar = new JMenuItem("Copiar");
            JMenuItem pegar = new JMenuItem("Pegar");
            JMenuItem generales = new JMenuItem("Generales");
            JMenuItem opcion1 = new JMenuItem("Opcion 1");
            JMenuItem opcion2 = new JMenuItem("Opcion 2");

            archivo.add(guardar);
            archivo.add(guardarComo);
            edicion.add(cortar);
            edicion.add(copiar);
            edicion.add(opciones);
            edicion.addSeparator();
            edicion.add(pegar);
            opciones.add(opcion1);
            opciones.add(opcion2);

            herramientas.add(generales);
            bar.add(archivo);
            bar.add(edicion);
            bar.add(herramientas);
            add(bar);

        }
    }

    public static void main(String[] args) {
        JmenuBar sin = new JmenuBar();
    }

}
