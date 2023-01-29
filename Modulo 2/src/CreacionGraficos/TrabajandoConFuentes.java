package CreacionGraficos;

import javax.swing.*;
import java.awt.*;



/**
 *
 * @author Ervin Caravali Ibarra
 */
public class TrabajandoConFuentes {
    public static void main(String[] args) {
        FrameConFuentes frame = new FrameConFuentes();
    }
}

class FrameConFuentes extends JFrame {
    public FrameConFuentes() {
        PanelConFuentes panel = new PanelConFuentes();
        add(panel);
        panel.setForeground(Color.blue);
        setTitle("Prueba con dos fuentes distintas fuentes");
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

    class PanelConFuentes extends JPanel{
        public void paintComponent (Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Font mifuente = new Font("Arial", Font.BOLD, 26);
            g2.setFont(mifuente);

            g2.drawString("Ervin Caravali Ibarra", 100, 100);
            g2.setFont(new Font("Arial", Font.ITALIC, 24));

            g2.drawString("Curso virtual de java", 100, 200);
        }

    }
