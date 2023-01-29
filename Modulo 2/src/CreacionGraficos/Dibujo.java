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
public class Dibujo {

    public static void main(String[] args) {

        MarcoConDibujos marco = new MarcoConDibujos();

    }

}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Figuras panel = new Figuras();
        add(panel);

    }
}

class Figuras extends JPanel {

    public void paintComponent(Graphics grafos) {
        super.paintComponent(grafos);
        Graphics2D grafos2 = (Graphics2D) grafos;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        grafos2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        grafos2.setPaint(new Color(0, 140, 255));
        grafos2.draw(elipse);
        grafos2.draw(new Line2D.Double(100, 100, 300, 250));
        double CentrolenX = rectangulo.getCenterX();
        double CentrolenY = rectangulo.getCenterY();
        double radio = 150;
         Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentrolenX, CentrolenY, CentrolenX + radio, CentrolenY + radio);
        grafos2.draw(circulo);

    }

}
