
package BarraHerramientas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class BarraHerramientas {
    public static void main(String[] args) {
        
        MarcoBarra frame = new MarcoBarra();
        
    }

}

class MarcoBarra extends JFrame {
    
    JPanel panel = new JPanel();
    
    public MarcoBarra() {
        
        
        setTitle("Prueba Acciones");
        setVisible(true);
        setBounds(350, 250, 600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Action accionAzul = new OyenteColor("Azul", new ImageIcon("src/barra_herramientas/bolaAzul.png"), Color.blue);
        Action accionAmarillo = new OyenteColor("Amarillo", new ImageIcon("src/barra_herramientas/bolaAmarilla.png"), Color.yellow);
        Action accionRojo = new OyenteColor("Rojo", new ImageIcon("src/barra_herramientas/bolaRoja.png"), Color.red);
        
        Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/barra_herramientas/salir.png")) {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        };
        
        JMenu menu = new JMenu("Color");
        menu.add(accionAzul);
        menu.add(accionAmarillo);
        menu.add(accionRojo);
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        
        setJMenuBar(barraMenu);
        add(panel);
        
      
        JToolBar barra = new JToolBar();
        barra.add(accionAzul);
        barra.add(accionAmarillo);
        barra.add(accionRojo);
        
        barra.addSeparator();
        
        barra.add(accionSalir);
        
        add(barra, BorderLayout.NORTH);
        
    }
    
    private class OyenteColor extends AbstractAction {
    
        public OyenteColor(String nombre, Icon icono, Color colorBoton) {
        
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, " Se pone el panel de color " + nombre);
            putValue("color de fondo", colorBoton);
                
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color)getValue("color de fondo");
                panel.setBackground(c);
                System.out.println("Nombres: " + getValue(Action.NAME) + " | Descripciones: " + getValue(Action.SHORT_DESCRIPTION));
            }
    
        }
    }


