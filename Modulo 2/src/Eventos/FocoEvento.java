package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class FocoEvento {
    
    public static void main(String[] args) {
        FrameFoco marco = new FrameFoco();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class FrameFoco extends JFrame {
    
    public FrameFoco() {
        
        setTitle("Eventos De Foco");
        setVisible(true);
        setBounds(300, 200, 600, 450);
        add(new PanelFoco());
        
    }
}

class PanelFoco extends JPanel {

    private JLabel titulo1;
    private JTextField cuadro1;
    private JLabel titulo2;
    private JTextField cuadro2;
    
    private class Foco implements FocusListener {
        
        @Override
        public void focusGained(FocusEvent e) {
            
        }
        
        @Override
        public void focusLost(FocusEvent e) {
            
            String email = cuadro1.getText();
            boolean comprobacion = false;
            
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                }
            }
            
            if (comprobacion) {
                System.out.println("Es acertado el email");
                
            } else {
                System.out.println("No correcto");
            }
            
        }
        
    }
    
    public void paintComponent(Graphics h) {
        super.paintComponent(h);
        setLayout(null);
        titulo1 = new JLabel("Email");
        cuadro1 = new JTextField();
        titulo2 = new JLabel("Email");
        cuadro2 = new JTextField();
        titulo1.setBounds(120, 10, 150, 20);
        cuadro1.setBounds(120, 10, 150, 20);
        titulo2.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(titulo1);
        add(cuadro1);
        add(titulo2);
        add(cuadro2);
        
        cuadro1.addFocusListener(new Foco());
        
    }
    
}
