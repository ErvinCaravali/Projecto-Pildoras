package Eventos;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class RatonEventos {

    public static void main(String[] args) {
        EventosMouseVentana miVentana = new EventosMouseVentana();
    }
}

class Mouse_Event extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
        EventosMouseVentana miVentana = new EventosMouseVentana();
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Presionaste el boton izquierdo");
            miVentana.getContentPane().setBackground(Color.GREEN);
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {

            System.out.println("Presionaste el boton derecho");
            miVentana.getContentPane().setBackground(Color.blue);
        } else {
            System.out.println("Presionaste la rueda del mouse");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
  
    }

    @Override
    public void mouseExited(MouseEvent e) {
     
    }
}

class EventosMouseVentana extends JFrame {

    public EventosMouseVentana() {
        setTitle("Eventos del Raton");
        setSize(650, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addMouseListener(new Mouse_Event());
  
    }
}


