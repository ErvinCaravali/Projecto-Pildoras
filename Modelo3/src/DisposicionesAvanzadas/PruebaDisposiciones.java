
package DisposicionesAvanzadas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 
 */
public class PruebaDisposiciones {
    public static void main(String[] args) {
        FrameCaja framePrueba = new FrameCaja();
    }
}

class FrameCaja extends JFrame {
    
    public FrameCaja() {
        
        setTitle("Marco en la caja");   
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel rotulo1 = new JLabel("Nombre");
        JTextField texto1 = new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());
        Box cajaH1 = Box.createHorizontalBox();
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(texto1);
        
        JLabel rotulo2 = new JLabel("Contraseña");
        
        JTextField texto2 = new JTextField(10);
        
        texto2.setMaximumSize(texto2.getPreferredSize());
        
        Box cajaH2 = Box.createHorizontalBox();
        
        cajaH2.add(rotulo2);
        
        cajaH2.add(Box.createHorizontalStrut(10));
        
        cajaH2.add(texto2);
        
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(boton1);
        cajaH3.add(Box.createGlue());
        cajaH3.add(boton2);
        
        Box cajaVertical = Box.createVerticalBox();
        cajaVertical.add(cajaH1);
        cajaVertical.add(cajaH2);
        cajaVertical.add(cajaH3);
        
        add(cajaVertical, BorderLayout.CENTER);
        
    }
    
}