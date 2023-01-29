package CreacionGraficos;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;



/**
 *
 * @author Ervin Caravali Ibarra
 */
public class CreandoMarcoCentrado {
    public static void main(String[] args) {
    MarcoCentrado ventana = new MarcoCentrado();

    }
}


class MarcoCentrado extends JFrame {

    public MarcoCentrado(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setTitle("Marco Centrado");
        Image miIcono = miPantalla.getImage("icono.png");
        setIconImage(miIcono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
