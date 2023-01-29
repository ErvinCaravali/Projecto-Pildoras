package ComponentesSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra
 */
public class PruebadeArea {

    public static void main(String[] args) {
        FramePrueba frame = new FramePrueba();
    }
}

class FramePrueba extends JFrame {

    private JPanel Botones;
    private JButton Insertar, SaltoLinea;
    private JTextArea Texto;
    private JScrollPane ConBarras;

    public FramePrueba() {
        setTitle("Comprobando area de texto");
        setBounds(500, 300, 650, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Botones = new JPanel();
         Botones.setBackground(Color.orange);
        Insertar = new JButton("Ingreso");

        Insertar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Texto.append("huhahahahahahahhahahahahahahahahaha");
            }

        });

        Botones.add(Insertar);

        SaltoLinea = new JButton("Salto Linea");

        Botones.add(SaltoLinea);
        add(Botones, BorderLayout.SOUTH);
        Texto = new JTextArea(8, 20);
        ConBarras = new JScrollPane(Texto);
        add(ConBarras, BorderLayout.CENTER);

        SaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !Texto.getLineWrap();
                Texto.setLineWrap(saltar);

                if (saltar) {
                    SaltoLinea.setText("Quitar salto");
                } else {
                    SaltoLinea.setText("Salto Linea");
                }
            }
        });

    }

}
