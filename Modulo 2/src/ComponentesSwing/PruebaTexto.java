package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class PruebaTexto {

    public static void main(String[] args) {
        FrameTexto frame = new FrameTexto();
    }

}

class FrameTexto extends JFrame {

    public FrameTexto() {

        add(new PanelTexto());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pruebacion de Textos");
        setBounds(350, 250, 600, 350);

    }
}

class PanelTexto extends JPanel {

    JTextField campo = new JTextField(20);
    JLabel resultados = new JLabel("", JLabel.CENTER);

    public PanelTexto() {

        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel texto = new JLabel("Email: ");
        panel.add(texto);
        panel.add(campo);
        add(resultados);
        JButton boton = new JButton("Se Comprueba");
        panel.add(boton);
        GetText evento = new GetText();
        boton.addActionListener(evento);
        add(panel, BorderLayout.NORTH);
        add(resultados, BorderLayout.CENTER);
         panel.setBackground(Color.orange);
    }

    private class GetText implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;

            String email = campo.getText().trim();

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }

            if (correcto != 1) {
                resultados.setText("No correcto");
            } else {
                resultados.setText("Correcto");
            }

            System.out.println(campo.getText().trim());
        }

    }
}
