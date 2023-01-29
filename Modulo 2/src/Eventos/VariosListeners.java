
package Eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class VariosListeners {
    
    public static void main(String[] args) {
        
        FramePrincipal frame = new FramePrincipal();
        
    }

}

class FramePrincipal extends JFrame {
    
    public FramePrincipal() {
        
        setTitle("Prueba Varias ventanas");
        setVisible(true);
        setBounds(500, 300, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel_Principal panel = new Panel_Principal();
        add(panel);
             
    }
}

class Panel_Principal extends JPanel {
    private  JButton Cerrar;
    public Panel_Principal() {
        JButton botonNuevo = new JButton("Nuevos");
        add(botonNuevo);
        
        Cerrar = new JButton("Cerrar todos");
        add(Cerrar);
        
        ListenerNew oyente = new ListenerNew();
        botonNuevo.addActionListener(oyente);
        
    }
    
    private class ListenerNew implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Frame_Emergente marco = new Frame_Emergente(Cerrar);
            marco.setVisible(true);
        }
        
    }
       
}

class Frame_Emergente extends JFrame {
    private static int contadores = 1;
    public Frame_Emergente(JButton botonDePrincipal) {
        
        setTitle("Ventana " + contadores);
        contadores++;
        
        setBounds(40*contadores, 40*contadores, 300, 200);
        
        CierraTodos oyenteCerrar = new CierraTodos();
        
        botonDePrincipal.addActionListener(oyenteCerrar);
        
    }
    
    private class CierraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        
    }
    
    
    
}

