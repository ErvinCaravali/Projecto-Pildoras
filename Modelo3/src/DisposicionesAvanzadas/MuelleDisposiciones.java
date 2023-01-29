
package DisposicionesAvanzadas;

import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class MuelleDisposiciones {
    public static void main(String[] args) {
        FrameMuelle frame = new FrameMuelle();
    }
}

class FrameMuelle extends JFrame {
    public FrameMuelle() {
        add(new PanelMuelle());
        setSize(1000, 350);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class PanelMuelle extends JPanel {
    
    public PanelMuelle() {
        
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        
        SpringLayout layout = new SpringLayout();
        
        setLayout(layout);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        Spring muelle = Spring.constant(0, 10, 100);
        
        Spring muelleRigido = Spring.constant(80);
        
        layout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
        
        layout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
        
        layout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
        
        layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
        
        
    }
}
