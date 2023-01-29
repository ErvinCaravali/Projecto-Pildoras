package CreacionGraficos;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
class PanelImagen extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File miImagen = new File("src/graficos/icono.png");
        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("Imagen no se encuentra");

        }

        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);

        g.drawImage(imagen, 5, 5, null);

        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 200; j++) {
                if (i + j > 0) {

                    g.copyArea(0, 0, anchuraImagen, alturaImagen, 3037 * i, 1947 * j);
                }

            }
        }
        g.copyArea(0, 0, 3037, 1947, 150, 75);

    }

    private Image imagen;

}

public class PruebaImagenes {

    public static void main(String[] args) {
        FrameImagen frame = new FrameImagen();
    }
}

class FrameImagen extends JFrame {

    public FrameImagen() {
        PanelImagen panel = new PanelImagen();
        add(panel);
        setTitle("Ventana con Imagenes");
        setVisible(true);
        setBounds(750, 300, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
