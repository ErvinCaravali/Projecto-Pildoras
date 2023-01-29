/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class Slider extends JFrame {

    public Slider() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        LaminaS miLamina = new LaminaS();
        add(miLamina);

    }

    public static void main(String[] args) {
        Slider Frame = new Slider();
    }

    private static class LaminaS extends JPanel {

        public LaminaS() {
            setLayout(new BorderLayout());
            
            JSlider control = new JSlider(0,100,50);
         //   control.setOrientation(SwingConstants.VERTICAL);
         control.setMajorTickSpacing(50);
         control.setMinorTickSpacing(25);
         control.setFont(new Font("Serif",Font.ITALIC,12));
         control.setPaintTicks(true);
         control.setPaintLabels(true);
         control.setSnapToTicks(true);
            add(control);

        }
    }

}
