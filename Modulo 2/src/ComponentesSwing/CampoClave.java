
package ComponentesSwing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Ervin  Caravali Ibarra 1925648
 */
public class CampoClave {
    
    public static void main(String[] args) {
        ClabeFrame Frame = new ClabeFrame();
    }

}

class ClabeFrame extends JFrame {
    
    public ClabeFrame() {
        setTitle("Inicio de Aplicacion");
        add(new Panel());
        setSize(800,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class Panel extends JPanel {
    
    public Panel() {
        setLayout(new BorderLayout());
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.orange);
        panelSuperior.setLayout(new GridLayout(2,2));
        add(panelSuperior, BorderLayout.NORTH);
        
        JLabel label = new JLabel("Usuario");
        JLabel labe2 = new JLabel("Contraseña");
        
        JTextField usuario = new JTextField(15);
        
        CompruebaClave evento = new CompruebaClave();
        
        contrapocision.getDocument().addDocumentListener(evento);
        
        panelSuperior.add(label);
        panelSuperior.add(usuario);
        
        panelSuperior.add(labe2);
        panelSuperior.add(contrapocision);
        
        JButton enviar = new JButton("Enviar");
        
        add(enviar, BorderLayout.SOUTH);
        
        
    }
    
    private class CompruebaClave implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            char [] password;
            password = contrapocision.getPassword();
            
            if(password.length < 8 || password.length > 12) {
                contrapocision.setBackground(Color.red);
            } else {
                contrapocision.setBackground(Color.white);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char [] password;
            password = contrapocision.getPassword();
            
            if(password.length < 8 || password.length > 12) {
                contrapocision.setBackground(Color.red);
            } else {
                contrapocision.setBackground(Color.white);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
        
    }
    
    JPasswordField contrapocision = new JPasswordField(12);
}


