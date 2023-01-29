
package BarraHerramientas;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class MarcoEmergente {
    public static void main(String[] args) {
        FrameEmergente frameEmer = new FrameEmergente();
    }
}

class FrameEmergente extends JFrame {
    
    public FrameEmergente() {
        PanelEmergente panel = new PanelEmergente();
        add(panel);
        setVisible(true);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class PanelEmergente extends JPanel {
    
    public PanelEmergente() {
        
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion 1.0");
        JMenuItem opcion2 = new JMenuItem("Opcion 2.0");
        JMenuItem opcion3 = new JMenuItem("Opcion 3.0");
        
        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);
        
        setComponentPopupMenu(emergente);
        
    }
}
