
package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class LeerImagen {
    
    public static void main(String[] args) {
        MarcoImagen mimarco = new MarcoImagen();
        
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame {
    
    public MarcoImagen() {
        setTitle("Marco con Imagen");
        setBounds(750, 300, 300, 200);
        LaminaConImagen milamina = new LaminaConImagen();
        add(milamina);
    }
}

class LaminaConImagen extends JPanel {
    
    private Image imagen;
    
    public LaminaConImagen() {
        
        try {
            imagen = ImageIO.read(new File("src/excepciones/bola.gif"));
        } catch (IOException e) {
          System.out.println("Imagen no encontrada");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);
        if(imagen == null) {
           g.drawString("No podemos cargar la imagen", 10, 10);
        } else {
            
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        
        for(int i = 0; i < 300; i++) {
            for(int j = 0; j < 300; j++) {
                if(i + j > 0) {
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                }
            }
        }   
    }
 }
}
