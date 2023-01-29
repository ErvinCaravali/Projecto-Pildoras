
package ComponentesSwing;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Ervin Caravali 1925648
 */
public class Prueba {
    
    public static void main(String[] args) {
        FramePrueba frame = new FramePrueba();
    }

}

class FramePrueba extends JFrame {
    
    public FramePrueba() {
        setBounds(500,300,500,350);
        PanelPrueba panel = new PanelPrueba();
        panel.setBackground(Color.GREEN);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class PanelPrueba extends JPanel {
    
    public PanelPrueba() {
        JTextField campo = new JTextField(20);
        Document doc = campo.getDocument();
        doc.addDocumentListener(new EscuchaTexto());
        add(campo);
    }
    
    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
}
