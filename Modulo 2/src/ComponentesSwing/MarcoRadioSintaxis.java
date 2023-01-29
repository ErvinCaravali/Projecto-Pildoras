/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesSwing;

import javax.swing.*;

/**
 *
 * @author ervin caravali Ibarra 1925648
 */
public class MarcoRadioSintaxis extends JFrame {

    public MarcoRadioSintaxis() {
        setBounds(550, 300, 550, 300);
        setVisible(true);
        Radio_Lamina miLamina = new Radio_Lamina();
        add(miLamina);

    }

    public static void main(String[] args) {
        MarcoRadioSintaxis sin = new MarcoRadioSintaxis();
    }

    private static class Radio_Lamina extends JPanel {

        public Radio_Lamina() {

            ButtonGroup miGrupo1 = new ButtonGroup();
            ButtonGroup miGrupo2 = new ButtonGroup();
            JRadioButton boton1 = new JRadioButton("Azul", false);
            JRadioButton boton2 = new JRadioButton("Rojo", true);
            JRadioButton boton3 = new JRadioButton("Verde", false);
            JRadioButton boton4 = new JRadioButton("Masculino", false);
            JRadioButton boton5 = new JRadioButton("Femenino", false);

            miGrupo1.add(boton1);
            miGrupo1.add(boton2);
            miGrupo1.add(boton3);
            miGrupo2.add(boton4);
            miGrupo2.add(boton5);

            add(boton1);
            add(boton2);
            add(boton3);
            add(boton4);
            add(boton5);

        }
    }

}
