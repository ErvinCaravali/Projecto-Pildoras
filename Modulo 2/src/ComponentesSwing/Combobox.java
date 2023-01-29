/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ervin
 */
public class Combobox extends JFrame {

    public Combobox() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        Lamina miLamina = new Lamina();
        add(miLamina);

    }

    public static void main(String[] args) {
        Combobox Frame = new Combobox();
    }

    public class Lamina extends JPanel {

        private JLabel texto;
        private JComboBox miCombo;

        public Lamina() {
            setLayout(new BorderLayout());
            texto = new JLabel("En un lugar muy Lejano");
            texto.setFont(new Font("Serif", Font.PLAIN, 12));
            add(texto, BorderLayout.CENTER);

            JPanel LaminaNorte = new JPanel();
            miCombo = new JComboBox();
            miCombo.setEditable(true);
            miCombo.addItem("Serif");
            miCombo.addItem("SanSerif");
            miCombo.addItem("Monospaced");
            miCombo.addItem("Dialog");

            add(miCombo, BorderLayout.NORTH);
            
            miCombo.addActionListener(new ManejaCombo());

        }

        private class ManejaCombo implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,18));
            }

        }
    }
}
