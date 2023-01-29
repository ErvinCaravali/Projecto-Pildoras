package CreacionGraficos;
import javax.swing.JFrame;





/**
 *
 * @author Ervin Caravali Ibarra
 */
public class CreandoMarcos {
    public static void main(String[] args) {
    Ventana ventana1 = new Ventana();
    }
}

class Ventana extends JFrame{
    public Ventana(){
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Mi Primera Ventana");
        setResizable(false);

    }

}
