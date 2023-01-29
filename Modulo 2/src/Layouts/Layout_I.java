package Layouts;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Ervin Caravali Ibarra
 */
public class Layout_I {

    public static void main(String[] args) {
        VentanaLayout miVentana = new VentanaLayout();
    }
}

class VentanaLayout extends JFrame {

    public VentanaLayout() {

        add(new Panel_Layout(), BorderLayout.NORTH);
        add(new Panel_Layout2(), BorderLayout.SOUTH);
        setTitle("Layout");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Panel_Layout extends JPanel { 

    public Panel_Layout() {
        setLayout(new FlowLayout());
        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Azul"), BorderLayout.EAST);
    }
}

class Panel_Layout2 extends JPanel {

    public Panel_Layout2() {
        setLayout(new BorderLayout());
        add(new JButton("Morado"), BorderLayout.CENTER);
        add(new JButton("Gris"), BorderLayout.SOUTH);
    }
}
