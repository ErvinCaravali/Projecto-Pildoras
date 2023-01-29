
package Eventos;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Ervin Caravali Ibarra 
 */
public class VentanaEventos {
    
    public static void main(String[] args) {
        
        MarcoVentana marco = new MarcoVentana();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setTitle("Ventana 1");
        marco.setBounds(300, 300, 500, 350);
        marco.getContentPane().setBackground(Color.BLUE);
        MarcoVentana marco2 = new MarcoVentana();
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marco2.setTitle("Ventana 2");
        marco2.setBounds(900, 300, 500, 350);
        marco2.getContentPane().setBackground(Color.RED);
          
    }

}

class MarcoVentana extends JFrame {
    
    public MarcoVentana() {
       setTitle("Trabajo de ventanas");
        setBounds(300, 300, 500, 350);
        setVisible(true);
        setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana oyenteVentana = new Ventana();
        addWindowListener(oyenteVentana);  
         
    }
    
}

class Ventana extends WindowAdapter {
    
    
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }
    


    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }
    
    
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
    
    
}