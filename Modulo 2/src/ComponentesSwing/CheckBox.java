/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ervin Caravali Ibarra 
 */
public class CheckBox extends JFrame {

    public CheckBox() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        LaminaCheck miLamina = new LaminaCheck();
        add(miLamina);

    }

    public static void main(String[] args) {
        CheckBox Frame = new CheckBox();
    }

    private static class LaminaCheck extends JPanel {

        private JLabel texto;
        private JCheckBox check1, check2;

        public LaminaCheck() {
            setLayout(new BorderLayout());
            Font miletra = new Font("Serif", Font.PLAIN, 24);
            texto = new JLabel("En un Lugar de la pradera....");
            texto.setFont(miletra);

            JPanel lanimaTexto = new JPanel();
            lanimaTexto.add(texto);

            add(lanimaTexto, BorderLayout.CENTER);
            check1 = new JCheckBox("Negrita");
            check2 = new JCheckBox("Cursiva");
            
            
            check1.addActionListener(new ManejaChescks());
            check2.addActionListener(new ManejaChescks());
            
            JPanel lanimachecks = new JPanel();
            lanimachecks.add(check1);
            lanimachecks.add(check2);
            add(lanimachecks,BorderLayout.SOUTH);
            

        }

        private class ManejaChescks implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int tipo =0;
                
                if (check1.isSelected()) {
                    tipo+=Font.BOLD;
                }
                 if (check2.isSelected()) {
                    tipo+=Font.ITALIC;
                }

                texto.setFont(new Font("Serif", tipo, 24));
            }

        }

    }

}
