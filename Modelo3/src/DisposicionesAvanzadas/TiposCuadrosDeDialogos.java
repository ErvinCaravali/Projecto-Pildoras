package DisposicionesAvanzadas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class TiposCuadrosDeDialogos {

    public static void main(String[] args) {
        FrameCuadros frame = new FrameCuadros();
    }

}

class FrameCuadros extends JFrame {

    public FrameCuadros() {

        add(new PanelCuadros());
        add(new PanelCuadros());
        setBounds(500, 300, 400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class PanelCuadros extends JPanel {

    public PanelCuadros() {

        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");

        boton1.addActionListener(new AccionBotones());
        boton2.addActionListener(new AccionBotones());
        boton3.addActionListener(new AccionBotones());
        boton4.addActionListener(new AccionBotones());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }

    private class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {

                JOptionPane.showMessageDialog(PanelCuadros.this, "Mensaje de Prueba", "Advertencia", 0);

            } else if (e.getSource() == boton2) {

                JOptionPane.showInputDialog(PanelCuadros.this, "Introduce nombre", "Introduccion Datos", 2);

            } else if (e.getSource() == boton3) {

                JOptionPane.showConfirmDialog(PanelCuadros.this, "Elige opcion", "V Confirmar", 1, 1);

            } else {

                JOptionPane.showOptionDialog(PanelCuadros.this, "Elige", "V de Opciones", 1, 1, null, null, null);

            }
        }

    }
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private final JButton boton4;
}
