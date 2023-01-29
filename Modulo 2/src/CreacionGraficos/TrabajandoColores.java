
package CreacionGraficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class TrabajandoColores {
    
    public static void main(String[] args) {
        
        MarcoConColor mimarco = new MarcoConColor();
        
    }

}

class MarcoConColor extends JFrame {
    public MarcoConColor() {
        
        setTitle("Prueba de Dibujo");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        PanelColor panel = new PanelColor();
        add(panel);
        panel.setBackground(Color.YELLOW);
        
    }
}


class PanelColor extends JPanel {
    
    public void paintComponent(Graphics grafos) {
        super.paintComponent(grafos);
      
        Graphics2D grafos2 = (Graphics2D) grafos;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        grafos2.setPaint(Color.GREEN);
        grafos2.draw(rectangulo);
        grafos2.setPaint(Color.RED);
        grafos2.fill(rectangulo);
        grafos2.draw(rectangulo);
        Ellipse2D elips = new Ellipse2D.Double();
        elips.setFrame(rectangulo);
        Color micolor = new Color(125, 189, 200);
        grafos2.setPaint(micolor);
        grafos2.fill(elips);
        grafos2.draw(elips);
        grafos2.draw(new Line2D.Double(100, 100, 300, 250));
        
        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        double radio = 150;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
        
        grafos2.draw(circulo);
        
    }
}
    