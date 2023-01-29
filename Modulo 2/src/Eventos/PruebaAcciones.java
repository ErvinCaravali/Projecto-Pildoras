
package Eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class PruebaAcciones {
    public static void main(String[] args) {
        
        FrameAction frame = new FrameAction();
        
    }

}

class FrameAction extends JFrame {
    
    public FrameAction() {
        PanelAccion panel = new PanelAccion();
        add(panel);
        setTitle("Prueba accciones sobre ventanas");
        setVisible(true);
        setBounds(350, 250, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class PanelAccion extends JPanel {
    
    public PanelAccion() {

        var accionAmarillo = new OyenteColor("Amarillo", new ImageIcon("src/eventos/bolaAmarilla.png"), Color.yellow);
        
        OyenteColor accionAzul = new OyenteColor("Azul", new ImageIcon("src/eventos/bolaAzul.png"), Color.blue);
        OyenteColor accionRojo = new OyenteColor("Rojo", new ImageIcon("src/eventos/bolaRoja.png"), Color.red);
        
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl Z");
        
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        mapaEntrada.put(teclaAzul, "fondo_azul");
        mapaEntrada.put(teclaRojo, "fondo_rojo");
        
        ActionMap mapaAccion = getActionMap();
        
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);
        
        
        
        
        
        
        
        
        

        
        /*
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        */
        
    }
    
    private class OyenteColor extends AbstractAction{
    
    
    public OyenteColor(String nombre, Icon icono, Color colorBoton) {
        
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "poner el panel de color " + nombre);
        putValue("color_de_fondo", colorBoton);
             
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color)getValue("color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + " | Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
        }
    
    }
    
}


