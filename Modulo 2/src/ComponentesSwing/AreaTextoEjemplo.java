
package ComponentesSwing;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */


class PanelArea extends JPanel {
    public PanelArea() {
        JScrollPane panelBarra = new JScrollPane(area);
        area.setLineWrap(true);
        add(panelBarra);
        JButton boton = new JButton("Clicked");
        add(boton);
        boton.addActionListener(new OperacionSOobreArea());
        area.setBackground(Color.red);
    }
    
    private class OperacionSOobreArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(area.getText());
        }
        
    }
    JTextArea area = new JTextArea(15,20);
}

class FrameArea extends JFrame {
    
    public FrameArea() {
        
        PanelArea panel = new PanelArea();
         panel.setBackground(Color.orange);
        add(panel);
        setBounds(600,300,500,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class AreaTextoEjemplo {
    
    public static void main(String[] args) {
        FrameArea frame = new FrameArea();
    }

}




