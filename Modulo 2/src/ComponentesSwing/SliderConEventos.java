/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ervin Caravali Ibarra 1925648
 */
public class SliderConEventos extends JFrame {

    public SliderConEventos() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        LaminaSS miLamina = new LaminaSS();
        add(miLamina);

    }

    public static void main(String[] args) {
        SliderConEventos Frame = new SliderConEventos();
    }

    private static class LaminaSS extends JPanel {

        private JLabel rotulo;
        private JSlider control;
        private static int contador;

        public LaminaSS() {
            setLayout(new BorderLayout());
            rotulo = new JLabel(" En un lugar muy Lejano.........");
            add(rotulo, BorderLayout.CENTER);

            control = new JSlider(8, 50, 12);
            control.setMajorTickSpacing(20);
            control.setMinorTickSpacing(5);
            control.setFont(new Font("Serif", Font.ITALIC, 10));
            control.setPaintTicks(true);
            control.setPaintLabels(true);
            control.setSnapToTicks(true);

            JPanel LaminaSlider = new JPanel();
            LaminaSlider.add(control);
            add(LaminaSlider, BorderLayout.NORTH);

            control.addChangeListener(new ManajadoraSlider());

        }

        private class ManajadoraSlider implements ChangeListener {

            @Override
            public void stateChanged(ChangeEvent e) {
                rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
            }

        }

    }

}
