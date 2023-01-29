package Eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class FocoVentana extends JFrame implements WindowFocusListener {

    private FocoVentana marco1;
    private FocoVentana marco2;

    public static void main(String[] args) {

        FocoVentana ventana = new FocoVentana();
        ventana.init();

    }

    public void init() {
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(50, 100, 600, 350);
        marco2.setBounds(700, 100, 600, 350);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);

    }

    @Override
    public void windowLostFocus(WindowEvent e) {

        if (e.getSource() == marco1) {
            marco1.setTitle("");
        } else {
            marco2.setTitle("");
        }
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {

        if (e.getSource() == marco1) {
            marco1.setTitle("Se tiene el foco");
        } else {
            marco2.setTitle("Se tiene el foco");
        }

    }

}
