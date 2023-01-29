package Eventos;

import java.awt.Color;
import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
class EvaluarEstadoMarco extends JFrame {

    public EvaluarEstadoMarco() {

        setBounds(300, 300, 800, 600);
        Estado nuevoEstado = new Estado();
        setVisible(true);
        addWindowStateListener(nuevoEstado);
        this.getContentPane().setBackground(Color.orange);

    }
}

public class EstadoDeCambio {

    public static void main(String[] args) {
        EvaluarEstadoMarco Elmarco = new EvaluarEstadoMarco();
        Elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Estado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {

        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("La ventana está a pantalla completa");
        } else if (e.getNewState() == Frame.NORMAL) {
            System.out.println("La ventana está normal");
        } else if (e.getNewState() == Frame.ICONIFIED) {
            System.out.println("La ventana está minimizada");
        } else {
            System.out.println("La ventana está minimizada");
        }
    }

}
